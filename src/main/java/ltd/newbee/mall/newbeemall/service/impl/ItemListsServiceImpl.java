package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsHaveNextLevelMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.vo.ItemListsAndCountVO;
import ltd.newbee.mall.newbeemall.vo.ItemListsVO;
import ltd.newbee.mall.newbeemall.vo.NextLevelCategoryNameAndCountVO;

@Service
public class ItemListsServiceImpl implements ItemListsService {

	@Resource
	ItemListsMapper itemListsMapper;
	@Resource
	ItemListsHaveNextLevelMapper itemListsHaveNextLevelMapper;
	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

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
		return result;
	}
}