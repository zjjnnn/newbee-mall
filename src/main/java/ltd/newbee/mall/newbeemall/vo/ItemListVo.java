package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

public class ItemListVo implements Serializable {

	
	private Long goodsId;
	private String goodsName;
	private Long goodsCategoryId;
	private String goodsCoverImg;
	private Integer sellingPrice;
	private Date createTime;

	
	private String col1;	
	private String col1Name;	
	private String col2;	
	private String col2Name;
	private String col3;
	private String col3Name;
	
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
    
    
	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1 == null ? null : col1.trim();
	}

	public String getCol1Name() {
		return col1Name;
	}

	public void setCol1Name(String col1Name) {
		this.col1Name = col1Name == null ? null : col1Name.trim();
	}

	public String getCol2() {
		return col2;
	}

	public void setCol2(String col2) {
		this.col2 = col2 == null ? null : col2.trim();
	}

	public String getCol2Name() {
		return col2Name;
	}

	public void setCol2Name(String col2Name) {
		this.col2Name = col2Name == null ? null : col2Name.trim();
	}

	public String getCol3() {
		return col3;
	}

	public void setCol3(String col3) {
		this.col3 = col3 == null ? null : col3.trim();
	}

	public String getCol3Name() {
		return col3Name;
	}

	public void setCol3Name(String col3Name) {
		this.col3Name = col3Name == null ? null : col3Name.trim();
	}
}
