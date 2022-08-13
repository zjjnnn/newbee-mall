package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class Qa {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.6411468+09:00", comments = "Source field: qa.question_id")
	private Long questionId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.question")
	private String question;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.answer")
	private String answer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.q_date")
	private String qDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.a_date")
	private String aDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.status")
	private Byte status;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.user_id")
	private Long userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.goods_id")
	private Long goodsId;

	private Integer likes;

	private Integer questionCount;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.question_id")
	public Long getQuestionId() {
		return questionId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.question_id")
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.question")
	public String getQuestion() {
		return question;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.question")
	public void setQuestion(String question) {
		this.question = question == null ? null : question.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.answer")
	public String getAnswer() {
		return answer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.answer")
	public void setAnswer(String answer) {
		this.answer = answer == null ? null : answer.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.q_date")
	public String getqDate() {
		return qDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.q_date")
	public void setqDate(String qDate) {
		this.qDate = qDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.a_date")
	public String getaDate() {
		return aDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.a_date")
	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.status")
	public Byte getStatus() {
		return status;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.status")
	public void setStatus(Byte status) {
		this.status = status;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.user_id")
	public Long getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.user_id")
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.goods_id")
	public Long getGoodsId() {
		return goodsId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-08-09T14:45:56.642147+09:00", comments = "Source field: qa.goods_id")
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

}