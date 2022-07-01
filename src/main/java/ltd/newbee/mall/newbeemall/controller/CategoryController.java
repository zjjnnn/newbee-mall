package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

import ltd.newbee.mall.newbeemall.service.CategoryService;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryService egCategory;
	
	@GetMapping("/category")
	@ResponseBody
	public Result getgoodsDetail(Integer categoryById) {
		return ResultGenerator.genSuccessResult(egCategory.findCategoryById(categoryById));

	}
}
