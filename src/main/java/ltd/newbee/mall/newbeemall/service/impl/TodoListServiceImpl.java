package ltd.newbee.mall.newbeemall.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.TodoListMapper;
import ltd.newbee.mall.newbeemall.entity.TodoList;
import ltd.newbee.mall.newbeemall.service.TodoListService;

@Service
public class TodoListServiceImpl implements TodoListService {

	@Resource
	TodoListMapper todoListMapper;

	@Override
	public List<TodoList> getTodoList() {
		return todoListMapper.getTodoList();
	}

	@Override
	public List<TodoList> insertTodoAndGetTodoList(HashMap<String, Object> newTodo) {
		todoListMapper.insertTodo(newTodo);
		return todoListMapper.getTodoList();
	}

	@Override
	public List<TodoList> changeTodoStateAndGetTodoList(HashMap<String, Object> thisTodo) {
		// get thisTodo id and change finished state

		return null;
	}

}
