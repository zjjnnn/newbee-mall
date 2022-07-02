package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

import ltd.newbee.mall.newbeemall.service.SliderShowService;

@Controller
public class SliderShowController {
	
	@Resource
	private SliderShowService egSliderShow;
	
	@GetMapping("/SliderShow")
	@ResponseBody
	public Result getgoodsDetail(Integer sliderShowId) {
		return ResultGenerator.genSuccessResult(egSliderShow.findSliderShowId(sliderShowId));

	}
}
