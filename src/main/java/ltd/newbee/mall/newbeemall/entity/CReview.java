package ltd.newbee.mall.newbeemall.entity;

import java.util.List;

import javax.annotation.Generated;

public class CReview {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4296532+09:00", comments = "Source field: c_review.review_id")
	private Long reviewId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.goods_id")
	private Long goodsId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.sku_name")
	private String skuName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.user_id")
	private Long userId;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.user_name")
	private String userName;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_title")
	private String reviewTitle;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_message")
	private String reviewMessage;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.comment_date")
	private String commentDate;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.stars")
	private Integer stars;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.likes")
	private Integer likes;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.img1")
	private String imgs;

	private List<String> imgList;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.review_id")
	public Long getReviewId() {
		return reviewId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.review_id")
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.sku_name")
	public String getSkuName() {
		return skuName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.sku_name")
	public void setSkuName(String skuName) {
		this.skuName = skuName == null ? null : skuName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4306529+09:00", comments = "Source field: c_review.user_id")
	public Long getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.user_name")
	public String getUserName() {
		return userName;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.user_name")
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_title")
	public String getReviewTitle() {
		return reviewTitle;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_title")
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle == null ? null : reviewTitle.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_message")
	public String getReviewMessage() {
		return reviewMessage;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.review_message")
	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage == null ? null : reviewMessage.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.comment_date")
	public String getCommentDate() {
		return commentDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.comment_date")
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.stars")
	public Integer getStars() {
		return stars;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.stars")
	public void setStars(Integer stars) {
		this.stars = stars;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.likes")
	public Integer getLikes() {
		return likes;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.likes")
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.img1")
	public String getImgs() {
		return imgs;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-10T17:09:13.4316529+09:00", comments = "Source field: c_review.img1")
	public void setImgs(String imgs) {
		this.imgs = imgs == null ? null : imgs.trim();
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}

}