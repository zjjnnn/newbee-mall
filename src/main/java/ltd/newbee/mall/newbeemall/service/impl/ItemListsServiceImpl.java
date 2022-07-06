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
	public ItemListsAndCountVO findItemListsByCategoryId(int categoryId, int limitIndex, String orderBy,
			String ascOrDesc) {
		List<ItemListsVO> goodsList = new ArrayList<>();
		List<GoodsCategory> goodsCategories = ecGoodsCategoryMapper.selectGoodsCategory();
		HashSet<Integer> parentIds = new HashSet<Integer>();
		ItemListsAndCountVO result = new ItemListsAndCountVO();
		for (GoodsCategory goodsCategory : goodsCategories) {
			parentIds.add(goodsCategory.getParentId());
			if (goodsCategory.getCategoryId().equals(categoryId)) {
				result.setCategoryName(goodsCategory.getCategoryName());
			}
		}
		if (parentIds.contains(categoryId)) {
			int count = 0;
			goodsList = itemListsHaveNextLevelMapper.getItemListsByCategoryId(categoryId, orderBy, ascOrDesc,
					limitIndex);
			List<NextLevelCategoryNameAndCountVO> sublists = itemListsHaveNextLevelMapper
					.getSubCategoryNameAndNumsOfGoods(categoryId);
			result.setItemListsVOs(goodsList);
			result.setSubCategoryNameAndNumsOfGoods(sublists);
			for (NextLevelCategoryNameAndCountVO nextLevelCategoryNameAndCountVO : sublists) {
				count += nextLevelCategoryNameAndCountVO.getSubNumsOfGoods();
			}
			result.setNumsOfItems(count);
		} else {
			goodsList = itemListsMapper.getItemListsByCategoryId(categoryId, orderBy, ascOrDesc, limitIndex);
			result.setItemListsVOs(goodsList);
			result.setNumsOfItems(goodsList.size());
		}
		result.setSubCategoryWithGoodsDetailsVos(findSubCategory(categoryId));
		return result;
	}

	public List<SubCategoryWithGoodsDetailsVo> findSubCategory(int categoryId) {
		List<SubCategoryWithGoodsDetailsVo> subCategory = new ArrayList<SubCategoryWithGoodsDetailsVo>();
		List<SubCategoryWithGoodsDetails> detailsList = subCategoryWithGoodsDetailsMapper
				.getSubCategoryWithGoodsDetails(categoryId);
		HashSet<String> subCategoryNames = new HashSet<>();
		for (SubCategoryWithGoodsDetails i : detailsList) {
			subCategoryNames.add(i.getSubCategory());
		}
		for (String i : subCategoryNames) {
			SubCategoryWithGoodsDetailsVo newVo = new SubCategoryWithGoodsDetailsVo();
			newVo.setName(i);
			HashMap<String, Integer> goodsDetails = new HashMap<>();
			for (SubCategoryWithGoodsDetails j : detailsList) {
				if (j.getSubCategory().equals(i)) {
					goodsDetails.put(j.getDetails(), j.getNumsOfGoods());
				}
			}
			newVo.setGoodsDetailsList(goodsDetails);
			subCategory.add(newVo);
		}
		return subCategory;
	}

}