package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.SkuReviewService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class SkuReviewController {

	@Resource
	SkuReviewService skuReviewService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/review", method = RequestMethod.GET)
	@ResponseBody
	public Result getQandAList(Long goodsId) {
		return ResultGenerator.genSuccessResult(skuReviewService.getReviewsDataByGoodsId(goodsId));
	}
}
