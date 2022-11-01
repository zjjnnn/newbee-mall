package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;

import ltd.newbee.mall.newbeemall.util.CategoryItemUtil;

public interface CategoryItemsService {
	HashMap<String,Object> getCategoryItems(CategoryItemUtil cateParams);
}
