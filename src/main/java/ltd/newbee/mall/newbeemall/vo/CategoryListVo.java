package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

public class CategoryListVo implements Serializable {
	
	//@TableId(value ="id",type=IdType.AUTO)
	private Long id;
	
	private String name;
	private String image;
	private Long parent;
	private List<CategoryListVo> subList;

	public Long getId() {
		return id;
	}
	public void setId(Long categoryId) {
		this.id = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String categoryName) {
		this.name = categoryName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String categoryImage) {
		this.image = categoryImage;
	}
	public Long getParent() {
		return parent;
	}
	public void setParent(Long Parent) {
		this.parent = Parent;
	}
	public List<CategoryListVo> getSubList() {
		return subList;
	}
	public void setSubList(List<CategoryListVo> subList) {
		this.subList = subList;
	}
}
