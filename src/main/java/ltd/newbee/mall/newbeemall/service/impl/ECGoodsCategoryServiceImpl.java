package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.ECGoodsCategoryService;
import ltd.newbee.mall.newbeemall.vo.ECGoodsCategoryListVO;

@Service
public class ECGoodsCategoryServiceImpl implements ECGoodsCategoryService {

	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

	@Override // 取出整个表
	public List<ECGoodsCategoryListVO> getList() {
		List<GoodsCategory> ecGoodsCategories = ecGoodsCategoryMapper.selectGoodsCategory();
		List<ECGoodsCategoryListVO> subLists = new ArrayList<>();
		for (GoodsCategory ec : ecGoodsCategories) {
			if (ec.getParentId() == 0) {
				ECGoodsCategoryListVO subList = new ECGoodsCategoryListVO();
				// ec的getter setter 添加到sublist
				BeanUtils.copyProperties(ec, subList);
				subList.setSubList(getSubList(ecGoodsCategories, subList));
				subLists.add(subList);
			}
		}
		return subLists;
	}

	// 创建子表
	public List<ECGoodsCategoryListVO> getSubList(List<GoodsCategory> ecGoodsCategories,
			ECGoodsCategoryListVO ecGoodsCategoryListVO) {
		List<ECGoodsCategoryListVO> subLists = new ArrayList<>();
		for (GoodsCategory ec : ecGoodsCategories) {
			if (ecGoodsCategoryListVO.getCategoryId().equals(ec.getParentId())) {
				ECGoodsCategoryListVO subList = new ECGoodsCategoryListVO();
				BeanUtils.copyProperties(ec, subList);
				subList.setSubList(getSubList(ecGoodsCategories, subList));
				subLists.add(subList);
			}
		}
		return subLists;
	}

}
