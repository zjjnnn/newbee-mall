package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.util.PageQueryUtil;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

import ltd.newbee.mall.newbeemall.service.ItemListService;

@Controller
public class ItemListController {

	@Resource
	private ItemListService egItemList;

// 方法1 Postman: GET + Params
//	@GetMapping("/CategorySku")
//	@ResponseBody
//	public Result getCategorySkuId(Integer categorySkuId) {
//		return ResultGenerator.genSuccessResult(egCategorySku.findCategorySkuById(categorySkuId));
//	}
	
	//只能查询第3层 @PathVariable
	@RequestMapping(value = "/ItemList/{goods_category_id}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("goods_category_id") Long goodsCategoryId, String orderBy,
			String ascOrDesc, Long pageNo) {
		return ResultGenerator
				.genSuccessResult(egItemList.findCategoryInfoById(goodsCategoryId, orderBy, ascOrDesc, pageNo));
	}

	//只能查询第3层 map
	@RequestMapping(value = "/ItemList/third", method = RequestMethod.POST)
	@ResponseBody
	public Result queryItemList(@RequestBody Map<String, Object> params) {
		PageQueryUtil pageParams = new PageQueryUtil(params);
		return ResultGenerator.genSuccessResult(egItemList.findItemListThird(pageParams));
	}
	
	//增强版 可以同时查询2层和3层
	@RequestMapping(value = "/ItemList/sub", method = RequestMethod.POST)
	@ResponseBody
	public Result queryItemListSub(@RequestBody Map<String, Object> paramSub) {
		PageQueryUtil pageParamsSub = new PageQueryUtil(paramSub);
		return ResultGenerator.genSuccessResult(egItemList.findItemListSub(pageParamsSub));
	}
	
	//test
	@RequestMapping(value = "/ItemList/sub", method = RequestMethod.POST)
	@ResponseBody
	public Result queryItemListSubtest(@RequestBody Map<String, Object> paramSub) {
		PageQueryUtil pageParamsSub = new PageQueryUtil(paramSub);
		return ResultGenerator.genSuccessResult(egItemList.findItemListSub(pageParamsSub));
	}

}
