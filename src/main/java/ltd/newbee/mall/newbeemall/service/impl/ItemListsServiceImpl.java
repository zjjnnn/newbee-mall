package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsMapper;
import ltd.newbee.mall.newbeemall.entity.ECGoodsCategory;
import ltd.newbee.mall.newbeemall.entity.Sku;
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
		List<Sku> skulist = itemListsMapper.getItemListsByCategoryId(categoryId);
		List<ECGoodsCategory> categoryList = ecGoodsCategoryMapper.selectGoodsCategory();
		List<ItemListsVO> list = new ArrayList<>();
		BeanUtils.copyProperties(skulist, list);// 正在找bug
		int index = 0;
		for (ECGoodsCategory ec : categoryList) {
			if (list.get(index).getCategoryId().equals(ec.getCategoryId())) {
				list.get(index).setCategoryName(ec.getCategoryName());
				index++;
			}
		}
		return list;
	}
}
