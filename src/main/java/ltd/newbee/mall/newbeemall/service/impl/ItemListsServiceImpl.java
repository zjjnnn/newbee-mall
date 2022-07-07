package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsHaveNextLevelMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsMapper;
import ltd.newbee.mall.newbeemall.dao.SubCategoryWithGoodsDetailsMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.SubCategoryWithGoodsDetails;
import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.vo.ItemListsAndCountVO;
import ltd.newbee.mall.newbeemall.vo.ItemListsVO;
import ltd.newbee.mall.newbeemall.vo.NextLevelCategoryNameAndCountVO;
import ltd.newbee.mall.newbeemall.vo.SubCategoryWithGoodsDetailsVo;

@Service
public class ItemListsServiceImpl implements ItemListsService {

	@Resource
	ItemListsMapper itemListsMapper;
	@Resource
	ItemListsHaveNextLevelMapper itemListsHaveNextLevelMapper;
	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;
	@Resource
	SubCategoryWithGoodsDetailsMapper subCategoryWithGoodsDetailsMapper;

	@Override
	public ItemListsAndCountVO findItemListsByMap(HashMap<String, Object> keyWordsMap) {

		String categoryName = (String) keyWordsMap.get("categoryName");
		keyWordsMap.remove("categoryName");
		int categoryId = findCategoryId(categoryName);
		int page = (int) keyWordsMap.get("page");
		keyWordsMap.remove("page");
		String orderBy = (String) keyWordsMap.get("orderBy");
		keyWordsMap.remove("orderBy");
		String ascOrDesc = (String) keyWordsMap.get("ascOrDesc");
		keyWordsMap.remove("ascOrDesc");
		List<String> cols = new ArrayList<>();
		for (String col : keyWordsMap.keySet()) { // list中存放所有的col
			cols.add((String) keyWordsMap.get(col));
		}
		// 未筛选的商品list
		List<ItemListsVO> goodsList = itemListsHaveNextLevelMapper.getItemListsByCategoryId(categoryId, orderBy,
				ascOrDesc);
		// 当前分类下的筛选条件总表
		List<SubCategoryWithGoodsDetails> detailsList = subCategoryWithGoodsDetailsMapper
				.getSubCategoryWithGoodsDetails(categoryId);
		ItemListsAndCountVO result = new ItemListsAndCountVO();// 返回结果

		if (!cols.isEmpty()) {
			goodsList = selectGoodsByCols(cols, goodsList, detailsList);
		}
		HashSet<Integer> parentIds = getParentIdAndSetCategoryName(categoryId, result);// 取parentid，但应先筛选完商品再取

		result.setSubCategoryNameAndNumsOfGoods(findNextLevelCategoryNameAndCountVOs(categoryId, parentIds, goodsList));
		result.setSubCategoryWithGoodsDetailsVos(findSubCategory(categoryId, goodsList));
		result.setNumsOfItems(goodsList.size());
		result.setItemListsVOs(limit(page, goodsList));

		return result;
	}

	// 查找当前分类id
	public int findCategoryId(String categoryName) {
		List<GoodsCategory> list = ecGoodsCategoryMapper.selectGoodsCategory();
		int categoryId = 0;
		for (GoodsCategory goodsCategory : list) {
			if (goodsCategory.getCategoryName().equals(categoryName)) {
				categoryId = goodsCategory.getCategoryId();
			}
		}
		return categoryId;
	}

	// 查找子分类并计数
	public List<NextLevelCategoryNameAndCountVO> findNextLevelCategoryNameAndCountVOs(int categoryId,
			HashSet<Integer> parentIds, List<ItemListsVO> goodsList) {
		List<GoodsCategory> goodsCategories = ecGoodsCategoryMapper.selectGoodsCategory();
		List<NextLevelCategoryNameAndCountVO> nextCategories = new ArrayList<>();
		if (parentIds.contains(categoryId)) {
			for (GoodsCategory category : goodsCategories) {
				if (category.getParentId().equals(categoryId)) {
					NextLevelCategoryNameAndCountVO newVo = new NextLevelCategoryNameAndCountVO();
					newVo.setCategoryName(category.getCategoryName());
					int count = 0;
					for (ItemListsVO item : goodsList) {
						if (item.getGoodsCategoryId().equals(category.getCategoryId())) {
							count++;
						}
					}
					newVo.setSubNumsOfGoods(count);
					if (count != 0) {
						nextCategories.add(newVo);
					}
				}
			}
		}
		return nextCategories;
	}

	// 根据筛选条件筛选商品，有筛选条件时才使用该方法，无筛选条件时直接计件
	public List<ItemListsVO> selectGoodsByCols(List<String> cols, List<ItemListsVO> goodsList,
			List<SubCategoryWithGoodsDetails> detailsList) {
		HashSet<String> colNames = new HashSet<>();
		List<List<Long>> goodsIdsList = new ArrayList<>();
		List<Long> selectedGoodsIds = new ArrayList<>();
		for (String col : cols) {
			for (SubCategoryWithGoodsDetails detail : detailsList) {
				if (col.equals(detail.getCol())) { // 找出筛选条件中的colname
					colNames.add(detail.getColName());
					break;
				}
			}
		}

		for (String colName : colNames) {
			List<Long> goodsIds = new ArrayList<>();
			for (String col : cols) {
				for (SubCategoryWithGoodsDetails detail : detailsList) {
					// 当前colname下，col与该detail的col相等时，且goodsid不在列表中，取goodsid放入列表(取并集)
					if (col.equals(detail.getCol()) && detail.getColName().equals(colName)
							&& !goodsIds.contains(detail.getGoodsId())) {
						goodsIds.add(detail.getGoodsId());
					}
				}
			}
			goodsIdsList.add(goodsIds);
		}

		for (Long goodsId : goodsIdsList.get(0)) {// 先放入第一个colname的id
			selectedGoodsIds.add(goodsId);
		}
		// 不同colname的id取交集，放入list
		for (int i = 0; i < goodsIdsList.size() - 1; i++) {// 出问题
			for (Long goodsId : goodsIdsList.get(i)) {
				if (goodsIdsList.get(i + 1).contains(goodsId)) {
					selectedGoodsIds.add(goodsId);
				}
			}
		}

		for (int i = 0; i < goodsList.size(); i++) {// 出问题了
			if (!selectedGoodsIds.contains(goodsList.get(i).getGoodsId())) {
				goodsList.remove(i);
				i--;
			}
		}

		return goodsList;
	}

	// 取商品表中的所有parentid及设置当前分类名
	public HashSet<Integer> getParentIdAndSetCategoryName(int categoryId, ItemListsAndCountVO result) {
		List<GoodsCategory> goodsCategories = ecGoodsCategoryMapper.selectGoodsCategory();
		HashSet<Integer> parentIds = new HashSet<Integer>();
		for (GoodsCategory goodsCategory : goodsCategories) {
			parentIds.add(goodsCategory.getParentId());
			if (goodsCategory.getCategoryId().equals(categoryId)) {
				result.setCategoryName(goodsCategory.getCategoryName());
			}
		}
		return parentIds;
	}

	// 抽出筛选条件和计数
	public List<SubCategoryWithGoodsDetailsVo> findSubCategory(int categoryId, List<ItemListsVO> goodsList) {// 放入筛选后的商品列表

		List<SubCategoryWithGoodsDetailsVo> subCategory = new ArrayList<SubCategoryWithGoodsDetailsVo>();// 筛选条件及件数
		List<SubCategoryWithGoodsDetails> detailsList = subCategoryWithGoodsDetailsMapper// 当前分类下的筛选条件总表
				.getSubCategoryWithGoodsDetails(categoryId);
		HashSet<String> subCategoryNames = new HashSet<>();// 包含的colname
		HashSet<Long> goodsIds = new HashSet<>();

		for (ItemListsVO goods : goodsList) {// 取出筛选后的商品列表的goodsId
			goodsIds.add(goods.getGoodsId());
		}

		for (int i = 0; i < detailsList.size(); i++) {
			if (!goodsIds.contains(detailsList.get(i).getGoodsId())) {// 商品列表里不含该商品id时删掉该id的筛选条件
				detailsList.remove(i);
				i--;
			}
		}

		for (SubCategoryWithGoodsDetails i : detailsList) {
			subCategoryNames.add(i.getColName());// 放入筛选后的colname
		}

		for (String i : subCategoryNames) {
			SubCategoryWithGoodsDetailsVo newVo = new SubCategoryWithGoodsDetailsVo();
			newVo.setName(i);
			HashMap<String, Integer> goodsDetails = new HashMap<>();
			for (SubCategoryWithGoodsDetails j : detailsList) {
				if (!goodsDetails.containsKey(j.getCol()) && j.getColName().equals(i)) {
					goodsDetails.put(j.getCol(), 1);
				} else if (goodsDetails.containsKey(j.getCol()) && j.getColName().equals(i)) {
					int count = goodsDetails.get(j.getCol());
					count++;
					goodsDetails.replace(j.getCol(), count);
				}
			}
			newVo.setGoodsDetailsList(goodsDetails);
			subCategory.add(newVo);
		}
		return subCategory;
	}

	// limit表示件数
	public List<ItemListsVO> limit(int page, List<ItemListsVO> goodsList) {
		List<ItemListsVO> resultList = new ArrayList<>();
		int limit = (page - 1) * 10;
		for (int i = limit; i < goodsList.size(); i++) {
			resultList.add(goodsList.get(i));
		}
		return resultList;
	}

}