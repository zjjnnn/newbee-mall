package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TodoList;

public interface TodoListService {
	List<TodoList> getTodoList();

	List<TodoList> insertTodoAndGetTodoList(HashMap<String, Object> newTodo);

	List<TodoList> changeTodoStateAndGetTodoList(int todoId);

	List<TodoList> deleteTodoAndGetTodoList(int todoId);
}
