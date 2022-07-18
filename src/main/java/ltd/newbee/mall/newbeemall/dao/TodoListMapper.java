package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.TodoList;

public interface TodoListMapper {
	List<TodoList> getTodoList();

	int insertTodo(Map<String, Object> todo);

	int changeTodoState(int id);

	int deleteTodo(int id);
}
