package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class GoodsFeatures {
	private Integer countCloGoods;
	
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1232263+09:00", comments="Source field: goods_features.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.goods_id")
    private Long goodsId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.col")
    private String col;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.col_name")
    private String colName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.goods_id")
    public Long getGoodsId() {
        return goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.goods_id")
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.col")
    public String getCol() {
        return col;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.col")
    public void setCol(String col) {
        this.col = col == null ? null : col.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1252213+09:00", comments="Source field: goods_features.col_name")
    public String getColName() {
        return colName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-25T15:06:16.1262183+09:00", comments="Source field: goods_features.col_name")
    public void setColName(String colName) {
        this.colName = colName == null ? null : colName.trim();
    }

	public Integer getCountCloGoods() {
		return countCloGoods;
	}

	public void setCountCloGoods(Integer countCloGoods) {
		this.countCloGoods = countCloGoods;
	}

}