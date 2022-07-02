package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;

public class SliderShowVO implements Serializable {

	private String imgUrl;

	private String directUrl;

	private String desc1;

	private String desc2;

	private Integer imgOrder;

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDirectUrl() {
		return directUrl;
	}

	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}

	public Integer getImgOrder() {
		return imgOrder;
	}

	public void setImgOrder(Integer imgOrder) {
		this.imgOrder = imgOrder;
	}

}
