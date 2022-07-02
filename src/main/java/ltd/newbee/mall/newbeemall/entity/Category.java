package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class Category {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.53018+09:00", comments="Source field: category.category_id")
    private Long categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530275+09:00", comments="Source field: category.category_name")
    private String categoryName;
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530275+09:00", comments="Source field: category.category_image")
    private String categoryImage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530363+09:00", comments="Source field: category.category_parent")
    private Long categoryParent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530451+09:00", comments="Source field: category.category_active")
    private Long categoryActive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530236+09:00", comments="Source field: category.category_id")
    public Long getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530258+09:00", comments="Source field: category.category_id")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530292+09:00", comments="Source field: category.category_name")
    public String getCategoryName() {
        return categoryName;
    }
    
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.53033+09:00", comments="Source field: category.category_name")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530292+09:00", comments="Source field: category.category_image")
    public String getCategoryImage() {
        return categoryImage;
    }
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.53033+09:00", comments="Source field: category.category_image")
    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage == null ? null : categoryImage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.5304+09:00", comments="Source field: category.category_parent")
    public Long getCategoryParent() {
        return categoryParent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530435+09:00", comments="Source field: category.category_parent")
    public void setCategoryParent(Long categoryParent) {
        this.categoryParent = categoryParent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530467+09:00", comments="Source field: category.category_active")
    public Long getCategoryActive() {
        return categoryActive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530484+09:00", comments="Source field: category.category_active")
    public void setCategoryActive(Long categoryActive) {
        this.categoryActive = categoryActive;
    }
}