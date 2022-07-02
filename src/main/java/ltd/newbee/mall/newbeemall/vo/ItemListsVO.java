package ltd.newbee.mall.newbeemall.vo;

import ltd.newbee.mall.newbeemall.entity.Sku;

public class ItemListsVO extends Sku {
	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
