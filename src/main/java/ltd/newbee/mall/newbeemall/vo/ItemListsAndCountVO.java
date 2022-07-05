package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

public class ItemListsAndCountVO {

	private Integer numsOfItems;

	private String categoryName;

	private List<ItemListsVO> itemListsVOs;

	private List<NextLevelCategoryNameAndCountVO> subCategoryNameAndNumsOfGoods;

	public Integer getNumsOfItems() {
		return numsOfItems;
	}

	public void setNumsOfItems(Integer numsOfItems) {
		this.numsOfItems = numsOfItems;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ItemListsVO> getItemListsVOs() {
		return itemListsVOs;
	}

	public void setItemListsVOs(List<ItemListsVO> itemListsVOs) {
		this.itemListsVOs = itemListsVOs;
	}

	public List<NextLevelCategoryNameAndCountVO> getSubCategoryNameAndNumsOfGoods() {
		return subCategoryNameAndNumsOfGoods;
	}

	public void setSubCategoryNameAndNumsOfGoods(List<NextLevelCategoryNameAndCountVO> subCategoryNameAndNumsOfGoods) {
		this.subCategoryNameAndNumsOfGoods = subCategoryNameAndNumsOfGoods;
	}

}
