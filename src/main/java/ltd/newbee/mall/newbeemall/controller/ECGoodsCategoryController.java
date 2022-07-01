package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.ECGoodsCategoryService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ECGoodsCategoryController {

	@Resource
	private ECGoodsCategoryService ecGoodsCategoryService;

	@GetMapping("/ecGoodsCategories")
	@ResponseBody
	public Result getGoodsCategories() {
		return ResultGenerator.genSuccessResult(ecGoodsCategoryService.getList());
	}

}
