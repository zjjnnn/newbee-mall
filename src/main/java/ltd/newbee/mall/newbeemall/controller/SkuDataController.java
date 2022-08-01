package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.SkuDataService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class SkuDataController {

	@Resource
	SkuDataService skuDataService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/sku")
	@ResponseBody
	public Result getSkuData(long goodsId, String size, String color) {
		return ResultGenerator.genSuccessResult(skuDataService.getSkuDataAndSizeAndColorList(goodsId, size, color));
	}

}
