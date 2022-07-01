package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.ECGoodsCategory;

public class ECGoodsCategoryListVO extends ECGoodsCategory {

	private List<ECGoodsCategoryListVO> subList;

	public List<ECGoodsCategoryListVO> getSubList() {
		return subList;
	}

	public void setSubList(List<ECGoodsCategoryListVO> subList) {
		this.subList = subList;
	}

}
