package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

public class ItemListVo implements Serializable {

	// @TableId(value ="id",type=IdType.AUTO)
	private Long goodsId;
	private String goodsName;
	private Long goodsCategoryId;
	private String goodsCoverImg;
	private Integer sellingPrice;
	private Date createTime;
//	private Long categoryCount;
//
//	public Long getCategoryCount() {
//		return categoryCount;
//	}
//
//	public void setCategoryCount(Long categoryCount) {
//		this.categoryCount = categoryCount;
//	}
	
	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	public Long getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(Long goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	public String getGoodsCoverImg() {
		return goodsCoverImg;
	}

	public void setGoodsCoverImg(String goodsCoverImg) {
		this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
    public Date getCreateTime() {
        return createTime;
    }    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
