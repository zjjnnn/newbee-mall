package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.RescentSawGoodsService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class RescentSawGoodsController {

	@Resource
	private RescentSawGoodsService rescentSawGoodsService;

	@GetMapping("/rescentSawGoods")
	@ResponseBody
	public Result rescentSawGoods(long userId) {
		return ResultGenerator.genSuccessResult(rescentSawGoodsService.findRescentSawGoodsBySkuId(userId));
	}

}
