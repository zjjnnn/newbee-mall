package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CategoryInfoMapper;
import ltd.newbee.mall.newbeemall.service.CategoryInfoService;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.CategoryInfoListVo;

@Service
public class CategoryInfoServiceImpl implements CategoryInfoService {

	@Resource
	CategoryInfoMapper egCategoryInfoMapper;

	@Override
	// findCategoryInfoById
	public HashMap<String, Object> findCategoryInfoById(Long goodsCategoryId, String orderBy, String ascOrDesc,
			Long pageNo) {
		long offsetId = (pageNo - 1) * 10;
		// 取出entity里面所有的内容
		List<TbNewbeeMallGoodsInfo> entityList = egCategoryInfoMapper.selectCategoryInfo(goodsCategoryId, orderBy,
				ascOrDesc, offsetId);

		// 创建一个需要返回展示集合对象voList
		List<CategoryInfoListVo> voList = new ArrayList<>();
		// 所有内容进行遍历塞入voList
		for (TbNewbeeMallGoodsInfo entity : entityList) {
			// 赋值到vo类，加入到集合中去
			CategoryInfoListVo vo = new CategoryInfoListVo();
			// BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
			BeanUtils.copyProperties(entity, vo);
			// 把每项添加进voList
			voList.add(vo);
		}

		// 增加count
		List<TbNewbeeMallGoodsInfo> entityCount = egCategoryInfoMapper.selectCategoryCount(goodsCategoryId);
		Long count = entityCount.get(0).getCategoryCount();
		
		//把count和volist塞进一个HashMap里面
		HashMap<String, Object> fullList = new HashMap<String, Object>();
		fullList.put("list", voList);
		fullList.put("count", count);

		return fullList;
	}

}
