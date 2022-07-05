package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ItemListMapper;
import ltd.newbee.mall.newbeemall.service.ItemListService;
import ltd.newbee.mall.newbeemall.util.PageQueryUtil;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.ItemListVo;

@Service
public class ItemListServiceImpl implements ItemListService {

	@Resource
	ItemListMapper egCategoryInfoMapper;

	@Override
	// findCategoryInfoById
	public HashMap<String, Object> findCategoryInfoById(Long goodsCategoryId, String orderBy, String ascOrDesc,
			Long pageNo) {
		Long offsetId = (pageNo - 1) * 10;
		// 取出entity里面所有的内容
		List<TbNewbeeMallGoodsInfo> entityList = egCategoryInfoMapper.selectCategoryInfo(goodsCategoryId, orderBy,
				ascOrDesc, offsetId);

		// 创建一个需要返回展示集合对象voList
		List<ItemListVo> voList = new ArrayList<>();
		// 所有内容进行遍历塞入voList
		for (TbNewbeeMallGoodsInfo entity : entityList) {
			// 赋值到vo类，加入到集合中去
			ItemListVo vo = new ItemListVo();
			// BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
			BeanUtils.copyProperties(entity, vo);
			// 把每项添加进voList
			voList.add(vo);
		}

		// 增加count
		List<TbNewbeeMallGoodsInfo> entityCount = egCategoryInfoMapper.selectCategoryCount(goodsCategoryId);
		Long count = entityCount.get(0).getCategoryCount();

		// 把count和volist塞进一个HashMap里面
		HashMap<String, Object> fullList = new HashMap<String, Object>();
		fullList.put("list", voList);
		fullList.put("count", count);

		return fullList;
	}

	// findCategoryInfoParam 通过map传值
	public HashMap<String, Object> findCategoryInfoParam(PageQueryUtil pageParams) {

		Long goodsCategoryId = (Long) pageParams.get("goodsCategoryId");
		String orderBy = (String) pageParams.get("orderBy");
		String ascOrDesc = (String) pageParams.get("ascOrDesc");
		Long pageNo = (Long) pageParams.get("pageNo");
		Long limit = (Long) pageParams.get("limit");
		Long offSet = (Long) pageParams.get("offSet");
		
		List<TbNewbeeMallGoodsInfo> entityList = egCategoryInfoMapper.selectCategoryInfoParam(goodsCategoryId, orderBy,
				ascOrDesc, limit, offSet);

		// 创建一个需要返回展示集合对象voList
		List<ItemListVo> voList = new ArrayList<>();
		// 所有内容进行遍历塞入voList
		for (TbNewbeeMallGoodsInfo entity : entityList) {
			// 赋值到vo类，加入到集合中去
			ItemListVo vo = new ItemListVo();
			// BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
			BeanUtils.copyProperties(entity, vo);
			// 把每项添加进voList
			voList.add(vo);
		}

		// 增加count
		List<TbNewbeeMallGoodsInfo> entityCount = egCategoryInfoMapper.selectCategoryCount(goodsCategoryId);
		Long count = entityCount.get(0).getCategoryCount();

		// 把count和volist塞进一个HashMap里面
		HashMap<String, Object> fullList = new HashMap<String, Object>();
		fullList.put("list", voList);
		fullList.put("count", count);

		return fullList;
	}

}
