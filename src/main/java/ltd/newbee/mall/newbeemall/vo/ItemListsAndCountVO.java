package ltd.newbee.mall.newbeemall.vo;

import java.util.List;

public class ItemListsAndCountVO {

	private List<ItemListsVO> itemListsVOs;

	private Integer numsOfItems;

	public Integer getNumsOfItems() {
		return numsOfItems;
	}

	public void setNumsOfItems(Integer numsOfItems) {
		this.numsOfItems = numsOfItems;
	}

	public List<ItemListsVO> getItemListsVOs() {
		return itemListsVOs;
	}

	public void setItemListsVOs(List<ItemListsVO> itemListsVOs) {
		this.itemListsVOs = itemListsVOs;
	}

}
