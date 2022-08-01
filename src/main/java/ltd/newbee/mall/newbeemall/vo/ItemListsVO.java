package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public class ItemListsVO extends NewBeeMallGoods {

	private List<String> colorImgUrlList;

	private List<String> detailsImgUrlList;

	public List<String> getColorImgUrlList() {
		return colorImgUrlList;
	}

	public void setColorImgUrlList(List<String> colorImgUrlList) {
		this.colorImgUrlList = colorImgUrlList;
	}

	public List<String> getDetailsImgUrlList() {
		return detailsImgUrlList;
	}

	public void setDetailsImgUrlList(List<String> detailsImgUrlList) {
		this.detailsImgUrlList = detailsImgUrlList;
	}

}
