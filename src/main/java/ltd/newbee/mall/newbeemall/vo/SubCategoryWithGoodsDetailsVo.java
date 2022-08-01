package ltd.newbee.mall.newbeemall.vo;

import java.util.Map;

public class SubCategoryWithGoodsDetailsVo {

	private String name;

	private Map<String, Integer> subDetailsList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Integer> getSubDetailsList() {
		return subDetailsList;
	}

	public void setSubDetailsList(Map<String, Integer> subDetailsList) {
		this.subDetailsList = subDetailsList;
	}
}
