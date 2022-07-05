package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallGoodsCategory {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.933014+09:00", comments="Source field: tb_newbee_mall_goods_category.category_id")
    private Long categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934202+09:00", comments="Source field: tb_newbee_mall_goods_category.category_level")
    private Byte categoryLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934285+09:00", comments="Source field: tb_newbee_mall_goods_category.parent_id")
    private Long parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934364+09:00", comments="Source field: tb_newbee_mall_goods_category.category_name")
    private String categoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934462+09:00", comments="Source field: tb_newbee_mall_goods_category.category_rank")
    private Integer categoryRank;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934542+09:00", comments="Source field: tb_newbee_mall_goods_category.is_deleted")
    private Byte isDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934621+09:00", comments="Source field: tb_newbee_mall_goods_category.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934717+09:00", comments="Source field: tb_newbee_mall_goods_category.create_user")
    private Integer createUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934797+09:00", comments="Source field: tb_newbee_mall_goods_category.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.93488+09:00", comments="Source field: tb_newbee_mall_goods_category.update_user")
    private Integer updateUser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530275+09:00", comments="Source field: category.category_image")
    private String categoryImage;
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.530292+09:00", comments="Source field: category.category_image")
    public String getCategoryImage() {
        return categoryImage;
    }
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-02T15:16:18.53033+09:00", comments="Source field: category.category_image")
    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage == null ? null : categoryImage.trim();
    }
     
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934006+09:00", comments="Source field: tb_newbee_mall_goods_category.category_id")
    public Long getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934168+09:00", comments="Source field: tb_newbee_mall_goods_category.category_id")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934231+09:00", comments="Source field: tb_newbee_mall_goods_category.category_level")
    public Byte getCategoryLevel() {
        return categoryLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934259+09:00", comments="Source field: tb_newbee_mall_goods_category.category_level")
    public void setCategoryLevel(Byte categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934312+09:00", comments="Source field: tb_newbee_mall_goods_category.parent_id")
    public Long getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934339+09:00", comments="Source field: tb_newbee_mall_goods_category.parent_id")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.93439+09:00", comments="Source field: tb_newbee_mall_goods_category.category_name")
    public String getCategoryName() {
        return categoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934435+09:00", comments="Source field: tb_newbee_mall_goods_category.category_name")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.93449+09:00", comments="Source field: tb_newbee_mall_goods_category.category_rank")
    public Integer getCategoryRank() {
        return categoryRank;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934517+09:00", comments="Source field: tb_newbee_mall_goods_category.category_rank")
    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934569+09:00", comments="Source field: tb_newbee_mall_goods_category.is_deleted")
    public Byte getIsDeleted() {
        return isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934596+09:00", comments="Source field: tb_newbee_mall_goods_category.is_deleted")
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934662+09:00", comments="Source field: tb_newbee_mall_goods_category.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934691+09:00", comments="Source field: tb_newbee_mall_goods_category.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934744+09:00", comments="Source field: tb_newbee_mall_goods_category.create_user")
    public Integer getCreateUser() {
        return createUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934771+09:00", comments="Source field: tb_newbee_mall_goods_category.create_user")
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934825+09:00", comments="Source field: tb_newbee_mall_goods_category.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934853+09:00", comments="Source field: tb_newbee_mall_goods_category.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934906+09:00", comments="Source field: tb_newbee_mall_goods_category.update_user")
    public Integer getUpdateUser() {
        return updateUser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-05T09:07:41.934933+09:00", comments="Source field: tb_newbee_mall_goods_category.update_user")
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}