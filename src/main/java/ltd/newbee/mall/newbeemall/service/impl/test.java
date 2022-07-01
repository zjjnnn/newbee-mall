package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.ECGoodsCategory;
import ltd.newbee.mall.newbeemall.vo.ECGoodsCategoryListVO;

public class test {

	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

	public List<ECGoodsCategoryListVO> getList() {
		List<ECGoodsCategory> ecGoodsCategories = ecGoodsCategoryMapper.selectGoodsCategory();
		List<ECGoodsCategoryListVO> subLists = new ArrayList<>();
		for (ECGoodsCategory ec : ecGoodsCategories) {
			if (ec.getParentId() == 0) {
				ECGoodsCategoryListVO subList = new ECGoodsCategoryListVO();
				// get ec1的属性添加到sublist
				BeanUtils.copyProperties(ec, subList);
				subList.setSubList(getSubList(ecGoodsCategories, subList));
				subLists.add(subList);
			}
		}
		return subLists;
	}

	public List<ECGoodsCategoryListVO> getSubList(List<ECGoodsCategory> ecGoodsCategories,
			ECGoodsCategoryListVO ecGoodsCategoryListVO) {
		List<ECGoodsCategoryListVO> subLists = new ArrayList<>();
		for (ECGoodsCategory ec : ecGoodsCategories) {
			if (ecGoodsCategoryListVO.getCategoryId().equals(ecGoodsCategoryListVO.getParentId())) {
				ECGoodsCategoryListVO subList = new ECGoodsCategoryListVO();
				BeanUtils.copyProperties(ec, subList);
				subList.setSubList(getSubList(ecGoodsCategories, subList));
				subLists.add(subList);
			}
		}
		return subLists;
	}

}
