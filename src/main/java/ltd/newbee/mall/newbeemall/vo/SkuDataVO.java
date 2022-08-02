package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.entity.SkuColor;

public class SkuDataVO extends Sku {

	private List<String> featureIconList;

	private List<String> imgList;

	private List<String> sizeList;

	private List<SkuColor> colorList;

	public List<String> getFeatureIconList() {
		return featureIconList;
	}

	public void setFeatureIconList(List<String> featureIconList) {
		this.featureIconList = featureIconList;
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}

	public List<String> getSizeList() {
		return sizeList;
	}

	public void setSizeList(List<String> sizeList) {
		this.sizeList = sizeList;
	}

	public List<SkuColor> getColorList() {
		return colorList;
	}

	public void setColorList(List<SkuColor> colorList) {
		this.colorList = colorList;
	}

}
