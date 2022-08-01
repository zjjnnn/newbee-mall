package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class Sku {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1299524+09:00", comments = "Source field: sku.sku_id")
	private Long skuId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_id")
	private Long goodsId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_name")
	private String goodsName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.sku_name")
	private String skuName;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size")
	private String size;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size_code")
	private String sizeCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color")
	private String color;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_code")
	private String colorCode;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_img")
	private String colorImg;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.catchcopy")
	private String catchcopy;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.price")
	private Long price;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.point")
	private Long point;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.size_detail")
	private String sizeDetail;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.material")
	private String material;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.weight")
	private String weight;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.warranty")
	private String warranty;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_method")
	private String deliveryMethod;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.stock")
	private Long stock;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_time")
	private String deliveryTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_img")
	private String deliveryImg;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.feature_icon")
	private String featureIcon;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.img")
	private String img;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.sku_id")
	public Long getSkuId() {
		return skuId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.sku_id")
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.goods_name")
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.sku_name")
	public String getSkuName() {
		return skuName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.sku_name")
	public void setSkuName(String skuName) {
		this.skuName = skuName == null ? null : skuName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size")
	public String getSize() {
		return size;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size")
	public void setSize(String size) {
		this.size = size == null ? null : size.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size_code")
	public String getSizeCode() {
		return sizeCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.size_code")
	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode == null ? null : sizeCode.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color")
	public String getColor() {
		return color;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color")
	public void setColor(String color) {
		this.color = color == null ? null : color.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_code")
	public String getColorCode() {
		return colorCode;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_code")
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode == null ? null : colorCode.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_img")
	public String getColorImg() {
		return colorImg;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.color_img")
	public void setColorImg(String colorImg) {
		this.colorImg = colorImg == null ? null : colorImg.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.catchcopy")
	public String getCatchcopy() {
		return catchcopy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1309526+09:00", comments = "Source field: sku.catchcopy")
	public void setCatchcopy(String catchcopy) {
		this.catchcopy = catchcopy == null ? null : catchcopy.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.price")
	public Long getPrice() {
		return price;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.price")
	public void setPrice(Long price) {
		this.price = price;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.point")
	public Long getPoint() {
		return point;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.point")
	public void setPoint(Long point) {
		this.point = point;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.size_detail")
	public String getSizeDetail() {
		return sizeDetail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.size_detail")
	public void setSizeDetail(String sizeDetail) {
		this.sizeDetail = sizeDetail == null ? null : sizeDetail.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.material")
	public String getMaterial() {
		return material;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.material")
	public void setMaterial(String material) {
		this.material = material == null ? null : material.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.weight")
	public String getWeight() {
		return weight;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.weight")
	public void setWeight(String weight) {
		this.weight = weight == null ? null : weight.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.warranty")
	public String getWarranty() {
		return warranty;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.warranty")
	public void setWarranty(String warranty) {
		this.warranty = warranty == null ? null : warranty.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_method")
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_method")
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod == null ? null : deliveryMethod.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.stock")
	public Long getStock() {
		return stock;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.stock")
	public void setStock(Long stock) {
		this.stock = stock;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_time")
	public String getDeliveryTime() {
		return deliveryTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_time")
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime == null ? null : deliveryTime.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_img")
	public String getDeliveryImg() {
		return deliveryImg;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.delivery_img")
	public void setDeliveryImg(String deliveryImg) {
		this.deliveryImg = deliveryImg == null ? null : deliveryImg.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.feature_icon")
	public String getFeatureIcon() {
		return featureIcon;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.feature_icon")
	public void setFeatureIcon(String featureIcon) {
		this.featureIcon = featureIcon == null ? null : featureIcon.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.img")
	public String getImg() {
		return img;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-01T20:38:10.1319533+09:00", comments = "Source field: sku.img")
	public void setImg(String img) {
		this.img = img == null ? null : img.trim();
	}

}