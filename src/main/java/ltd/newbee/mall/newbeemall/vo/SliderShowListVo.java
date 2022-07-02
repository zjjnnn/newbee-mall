package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class SliderShowListVo implements Serializable {

	// @TableId(value ="id",type=IdType.AUTO)
	private Integer imgOrder;
	private String imgUrl;
	private String directUrl;
	private String desc1;
	private String desc2;

	public Integer getImgOrder() {
        return imgOrder;
    }
	public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }
	public String getImgUrl() {
        return imgUrl;
    }
	public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
	public String getDirectUrl() {
        return directUrl;
    }
	public void setDirectUrl(String directUrl) {
        this.directUrl = directUrl == null ? null : directUrl.trim();
    }
	public String getDesc1() {
        return desc1;
    }
	public void setDesc1(String desc1) {
        this.desc1 = desc1 == null ? null : desc1.trim();
    }
	public String getDesc2() {
        return desc2;
    }
	public void setDesc2(String desc2) {
        this.desc2 = desc2 == null ? null : desc2.trim();
    }
}
