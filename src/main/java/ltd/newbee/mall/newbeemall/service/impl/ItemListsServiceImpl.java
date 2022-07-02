package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsMapper;
import ltd.newbee.mall.newbeemall.entity.ECGoodsCategory;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.vo.ItemListsVO;

@Service
public class ItemListsServiceImpl implements ItemListsService {

	@Resource
	ItemListsMapper itemListsMapper;

	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

	@Override
	public List<ItemListsVO> findItemListsByCategoryId(int categoryId) {
		List<NewBeeMallGoods> goodsList = itemListsMapper.getItemListsByCategoryId(categoryId);
		List<ECGoodsCategory> categoryList = ecGoodsCategoryMapper.selectGoodsCategory();
		List<ItemListsVO> list = new ArrayList<>();
		for (NewBeeMallGoods goods : goodsList) {
			ItemListsVO itemListsVO = new ItemListsVO();
			BeanUtils.copyProperties(goods, itemListsVO);
			list.add(itemListsVO);
		}
		for (int i = 0; i < list.size(); i++) {
			for (ECGoodsCategory ec : categoryList) {
				if (list.get(i).getGoodsCategoryId().equals(ec.getCategoryId())) {
					list.get(i).setCategoryName(ec.getCategoryName());
				}
			}
		}
		return list;
	}
}