package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;

public class SkuDataVO extends Sku {

	private List<String> skuSizeList;

	private List<SkuColor> skuColorList;

	public List<String> getSkuSizeList() {
		return skuSizeList;
	}

	public void setSkuSizeList(List<String> skuSizeList) {
		this.skuSizeList = skuSizeList;
	}

	public List<SkuColor> getSkuColorList() {
		return skuColorList;
	}

	public void setSkuColorList(List<SkuColor> skuColorList) {
		this.skuColorList = skuColorList;
	}

}
