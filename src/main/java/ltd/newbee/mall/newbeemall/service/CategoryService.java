package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.CategoryListVo;

public interface CategoryService{
	List<CategoryListVo> findCategoryById(Integer categoryById);
	
	//List<Category> findCategoryById(Integer categoryById);
}
