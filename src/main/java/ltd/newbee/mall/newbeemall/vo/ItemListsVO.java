package ltd.newbee.mall.newbeemall.vo;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public class ItemListsVO extends NewBeeMallGoods {
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
