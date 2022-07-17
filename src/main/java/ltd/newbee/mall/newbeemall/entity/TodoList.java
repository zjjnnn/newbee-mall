package ltd.newbee.mall.newbeemall.entity;

import javax.annotation.Generated;

public class TodoList {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3263411+09:00", comments = "Source field: todo_list.todo_text")
	private String todoText;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.month")
	private Integer month;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.day")
	private Integer day;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3283416+09:00", comments = "Source field: todo_list.finished")
	private Byte finished;

	private Integer id;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.todo_text")
	public String getTodoText() {
		return todoText;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.todo_text")
	public void setTodoText(String todoText) {
		this.todoText = todoText == null ? null : todoText.trim();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.month")
	public Integer getMonth() {
		return month;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3273408+09:00", comments = "Source field: todo_list.month")
	public void setMonth(Integer month) {
		this.month = month;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3283416+09:00", comments = "Source field: todo_list.day")
	public Integer getDay() {
		return day;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3283416+09:00", comments = "Source field: todo_list.day")
	public void setDay(Integer day) {
		this.day = day;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3283416+09:00", comments = "Source field: todo_list.finished")
	public Byte getFinished() {
		return finished;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2022-07-16T15:10:07.3283416+09:00", comments = "Source field: todo_list.finished")
	public void setFinished(Byte finished) {
		this.finished = finished;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}