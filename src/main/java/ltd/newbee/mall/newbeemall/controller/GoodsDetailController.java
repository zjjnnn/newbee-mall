package ltd.newbee.mall.newbeemall.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsImageService;
import ltd.newbee.mall.newbeemall.service.GoodsInfoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class GoodsDetailController {
	@Resource
	private GoodsDetailService goodsDetailService;

	@Resource
	private GoodsImageService goodsImageService;
	
	@Resource
	GoodsInfoService goodsInfoService;
	
	@GetMapping("/goodsDetail")
    @ResponseBody
    public Result getgoodsDetail(long goodsId) {
        return ResultGenerator.genSuccessResult(goodsDetailService.findGoodsDetailsByGoodsId(goodsId));
    }
	
	
	@GetMapping("/goodsImages")
    @ResponseBody
    public Result goodsImages(long goodsId) {
        return ResultGenerator.genSuccessResult(goodsImageService.GetGoodsImagesByGoodsId(goodsId));
    }
	
	@GetMapping("/goodsInfo")
    @ResponseBody
    public Result goodsInfo(long goodsId) {
        return ResultGenerator.genSuccessResult(goodsInfoService.getGoodsInfo(goodsId));
    }
}
