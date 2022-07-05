package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

public class ItemListCountVo implements Serializable {

	private Long goodsCategoryId;
	private Long goodsCategoryCount;
	private String categoryName;

	
	public Long getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(Long goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	public Long getCategoryCount() {
		return goodsCategoryCount;
	}
	public void setCategoryCount(Long goodsCategoryCount) {
		this.goodsCategoryCount = goodsCategoryCount;
	}
	public String getCategoryName() {
        return categoryName;
    }
	public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }
	
}
