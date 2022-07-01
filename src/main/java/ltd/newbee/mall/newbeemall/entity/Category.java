package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class Category {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854762+09:00", comments="Source field: category.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854862+09:00", comments="Source field: category.name")
    private String name;
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854862+09:00", comments="Source field: category.image")
    private String image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854917+09:00", comments="Source field: category.parent")
    private Long parent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854968+09:00", comments="Source field: category.active")
    private Integer active;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854821+09:00", comments="Source field: category.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854845+09:00", comments="Source field: category.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.85488+09:00", comments="Source field: category.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854901+09:00", comments="Source field: category.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.85488+09:00", comments="Source field: category.image")
    public String getImage() {
        return image;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854901+09:00", comments="Source field: category.image")
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854934+09:00", comments="Source field: category.parent")
    public Long getParent() {
        return parent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854952+09:00", comments="Source field: category.parent")
    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.854985+09:00", comments="Source field: category.active")
    public Integer getActive() {
        return active;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-01T12:03:34.855002+09:00", comments="Source field: category.active")
    public void setActive(Integer active) {
        this.active = active;
    }
}