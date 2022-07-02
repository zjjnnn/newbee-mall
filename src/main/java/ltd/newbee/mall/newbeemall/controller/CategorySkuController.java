package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

import ltd.newbee.mall.newbeemall.service.CategorySkuService;

@Controller
public class CategorySkuController {


	@Resource
	private CategorySkuService egCategorySku;

// 方法1 Postman: GET + Params
//	@GetMapping("/CategorySku")
//	@ResponseBody
//	public Result getCategorySkuId(Integer categorySkuId) {
//		return ResultGenerator.genSuccessResult(egCategorySku.findCategorySkuById(categorySkuId));
//	}

	//带参数
	@RequestMapping(value = "/CategorySku/{goods_category_id}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("goods_category_id") Long goodsCategoryId, String orderBy) {
		return ResultGenerator.genSuccessResult(egCategorySku.findCategorySkuById(goodsCategoryId,orderBy));
	}
	
	//不带参数默认传所有的
	@GetMapping("/CategorySku")
	@ResponseBody
	public Result queryProduct() {
		return ResultGenerator.genSuccessResult(egCategorySku.findCategorySkuById());
	}

}
