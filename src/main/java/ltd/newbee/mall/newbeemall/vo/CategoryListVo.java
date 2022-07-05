package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class CategoryListVo implements Serializable {
	
	//@TableId(value ="id",type=IdType.AUTO)
	private Long categoryId;
	private String categoryName;
	private String categoryImage;
	private Long parentId;
	private List<CategoryListVo> subList;

	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public List<CategoryListVo> getSubList() {
		return subList;
	}
	public void setSubList(List<CategoryListVo> subList) {
		this.subList = subList;
	}
}
