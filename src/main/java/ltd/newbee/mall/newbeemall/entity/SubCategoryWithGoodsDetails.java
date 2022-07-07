package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class SubCategoryWithGoodsDetails {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col")
	private String col;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col_name")
	private String colName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col")
	public String getCol() {
		return col;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col")
	public void setCol(String col) {
		this.col = col == null ? null : col.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col_name")
	public String getColName() {
		return colName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-07T11:42:01.1325747+09:00", comments = "Source field: sub_category_with_goods_details.col_name")
	public void setColName(String colName) {
		this.colName = colName == null ? null : colName.trim();
	}
}
