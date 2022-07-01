package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class ECGoodsCategoryImg {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.category_id")
    private Integer categoryId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.img")
    private String img;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.category_id")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.img")
    public String getImg() {
        return img;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T13:49:06.4127693+09:00", comments="Source field: ec_goods_category_img.img")
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}