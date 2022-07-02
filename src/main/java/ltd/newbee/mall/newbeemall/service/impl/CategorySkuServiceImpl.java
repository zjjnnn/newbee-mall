package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CategorySkuMapper;
import ltd.newbee.mall.newbeemall.service.CategorySkuService;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.CategorySkuListVo;

@Service
public class CategorySkuServiceImpl implements CategorySkuService {

	@Resource
	CategorySkuMapper egCategorySkuMapper;

	@Override
	public List<CategorySkuListVo> findCategorySkuById(Long categorySkuId, String orderBy) {
		// 取出所有的内容
		List<TbNewbeeMallGoodsInfo> entityList = egCategorySkuMapper.selectCategorySku(categorySkuId,orderBy);

		// 创建一个需要返回的vo展示集合对象
		List<CategorySkuListVo> voList = new ArrayList<>();

		// 所有内容进行遍历塞入voList
		for (TbNewbeeMallGoodsInfo entity : entityList) {
//			Integer i = categorySkuId;
//			Long l = new Long(i);

			// 判断categorySkuId是否为当前需要的
			if (categorySkuId == entity.getGoodsCategoryId()) {
				// 赋值到vo类，加入到集合中去
				CategorySkuListVo vo = new CategorySkuListVo();
				// BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
				BeanUtils.copyProperties(entity, vo);
				// 把每项添加进voList
				voList.add(vo);
			}
		}
		return voList;
		
		// orderBy=1 按照Price升序
//		if (orderBy.equals("1")) {
//			// list排序 Comparator.comparing(）
//			voList.sort(Comparator.comparing(CategorySkuListVo::getSellingPrice));
//		} 

		// switch判断
//		switch (orderBy) {
//		// orderBy=1 按照creat_time降序 新着顺
//		case "1":
//			// 语句
//			break;
//		// orderBy=2 按照SellingPrice升序 
//		case "2":
//			voList.sort(Comparator.comparing(CategorySkuListVo::getSellingPrice));
//			break;
//		// orderBy=3 按照SellingPrice降序
//		case "3":
//			break;
//		}
		
	}

	@Override
	public List<CategorySkuListVo> findCategorySkuById() {

		List<TbNewbeeMallGoodsInfo> entityList = egCategorySkuMapper.selectCategorySku();
		List<CategorySkuListVo> voList = new ArrayList<>();

		for (TbNewbeeMallGoodsInfo entity : entityList) {
			CategorySkuListVo vo = new CategorySkuListVo();
			BeanUtils.copyProperties(entity, vo);
			voList.add(vo);
		}
		return voList;
	}
}
