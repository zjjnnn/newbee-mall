package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

import ltd.newbee.mall.newbeemall.service.CategoryInfoService;

@Controller
public class CategoryInfoController {


	@Resource
	private CategoryInfoService egCategoryInfo;

// 方法1 Postman: GET + Params
//	@GetMapping("/CategorySku")
//	@ResponseBody
//	public Result getCategorySkuId(Integer categorySkuId) {
//		return ResultGenerator.genSuccessResult(egCategorySku.findCategorySkuById(categorySkuId));
//	}

	@RequestMapping(value = "/CategoryInfo/{goods_category_id}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("goods_category_id") Long goodsCategoryId, String orderBy, String ascOrDesc,Long pageNo) {
		return ResultGenerator.genSuccessResult(egCategoryInfo.findCategoryInfoById(goodsCategoryId,orderBy,ascOrDesc,pageNo));
	}

}
