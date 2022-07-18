package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.TodoListService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TodoListController {

	@Resource
	private TodoListService todoListService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/todos")
	@ResponseBody
	public Result getTodoList() {
		return ResultGenerator.genSuccessResult(todoListService.getTodoList());
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/todos")
	@ResponseBody
	public Result insertTodo(@RequestBody HashMap<String, Object> todo) {
		return ResultGenerator.genSuccessResult(todoListService.insertTodoAndGetTodoList(todo));
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/todos/{id}")
	@ResponseBody
	public Result changeTodoState(@PathVariable("id") int id) {
		return ResultGenerator.genSuccessResult(todoListService.changeTodoStateAndGetTodoList(id));
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/todos/{id}")
	@ResponseBody
	public Result deleteTodo(@PathVariable("id") int id) {
		return ResultGenerator.genSuccessResult(todoListService.deleteTodoAndGetTodoList(id));
	}
}
