package ltd.newbee.mall.newbeemall.entity;

import java.io.Serializable;

import javax.annotation.Generated;

public class ECGoodsCategory implements Serializable {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7161069+09:00", comments = "Source field: ec_goods_category.category_id")
	private Integer categoryId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7169901+09:00", comments = "Source field: ec_goods_category.name")
	private String categoryName;

	private String img;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.parent_id")
	private Integer parentId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.active")
	private Integer active;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7169901+09:00", comments = "Source field: ec_goods_category.category_id")
	public Integer getCategoryId() {
		return categoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7169901+09:00", comments = "Source field: ec_goods_category.category_id")
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.name")
	public String getCategoryName() {
		return categoryName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.name")
	public void setCategoryName(String name) {
		this.categoryName = name == null ? null : name.trim();
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.parent_id")
	public Integer getParentId() {
		return parentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.parent_id")
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.active")
	public Integer getActive() {
		return active;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-01T10:29:33.7179901+09:00", comments = "Source field: ec_goods_category.active")
	public void setActive(Integer active) {
		this.active = active;
	}
}