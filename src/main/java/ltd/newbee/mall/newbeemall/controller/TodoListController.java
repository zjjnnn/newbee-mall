package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.TodoListService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TodoListController {

	@Resource
	private TodoListService todoListService;

	@GetMapping("/todos")
	@ResponseBody
	public Result getTodoList() {
		return ResultGenerator.genSuccessResult(todoListService.getTodoList());
	}

	@PostMapping("/todos")
	@ResponseBody
	public Result insertTodo(@RequestBody HashMap<String, Object> todo) {
		return ResultGenerator.genSuccessResult(todoListService.insertTodoAndGetTodoList(todo));
	}
}
