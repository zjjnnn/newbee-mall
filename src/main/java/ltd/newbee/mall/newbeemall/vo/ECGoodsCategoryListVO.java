package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsCategory;

public class ECGoodsCategoryListVO extends GoodsCategory {// 继承entity层导入的数据

	private List<ECGoodsCategoryListVO> subList;// 展示层加subList

	public List<ECGoodsCategoryListVO> getSubList() {
		return subList;
	}

	public void setSubList(List<ECGoodsCategoryListVO> subList) {
		this.subList = subList;
	}

}
