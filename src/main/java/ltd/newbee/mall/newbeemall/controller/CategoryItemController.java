package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import ltd.newbee.mall.newbeemall.service.CategoryItemsService;
import ltd.newbee.mall.newbeemall.util.CategoryItemUtil;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class CategoryItemController {
	@Resource
	private CategoryItemsService categoryItemsService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/category/item")
	@ResponseBody
	public Result getCategoryItems(@RequestBody HashMap<String, Object> params ) {
		CategoryItemUtil cateParams= new CategoryItemUtil(params);
		return ResultGenerator.genSuccessResult(categoryItemsService.getCategoryItems(cateParams));
	}
	
}
