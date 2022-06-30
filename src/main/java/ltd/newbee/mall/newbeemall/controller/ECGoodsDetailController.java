package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.ECGoodsDetailService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ECGoodsDetailController {

	@Resource
	private ECGoodsDetailService ecGoodsDetailService;

	@GetMapping("/ecGoodsDetail")
	@ResponseBody
	public Result getGoodsDetail(int configType) {
		return ResultGenerator.genSuccessResult(ecGoodsDetailService.findGoodsDetailsByGoodsId(configType));
	}

}
