package ltd.newbee.mall.newbeemall.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.SelectItemsByColsMapper;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TestController {

	// 方法1 Postman: GET + Params
	@Resource
	private GoodsDetailService goodsDetailService;
	@Resource
	private SelectItemsByColsMapper selectItemsByColsMapper;

	@GetMapping("/goods/detail")
	@ResponseBody
	public Result getgoodsDetail(long goodsId) {
		return ResultGenerator.genSuccessResult(goodsDetailService.findGoodsDetailsByGoodsId(goodsId));
	}

	// 方法2 Postman:POST
	/**
	 * restful风格的参数请求 http://localhost:8080/goods/detail/review/222222
	 * 
	 * @param id
	 */

	@RequestMapping(value = "/goods/detail/review/{id}", method = RequestMethod.POST)
	@ResponseBody
	public Result queryProduct(@PathVariable("id") String id) {
		// ...业务处理
		return ResultGenerator.genSuccessResult(id);
	}

	// 方法3 Postman:DELETE Body-from-data
	@DeleteMapping("/goods/detail/review")
	@ResponseBody
	public Result review(@RequestParam(value = "reviewId", required = true) long reviewId) {
		System.out.println(reviewId);
		return ResultGenerator.genSuccessResult(reviewId);
	}

	// debug用
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@RequestBody HashMap<String, Object> map) {
		// ...业务处理
		Integer categoryId = (Integer) map.get("categoryId");
		map.remove("categoryId");
		List<String> cols = new ArrayList<>();
		for (String col : map.keySet()) { // list中存放所有的col
			cols.add((String) map.get(col));
		}
		List<Long> result = selectItemsByColsMapper.selectItemsByCols(categoryId, cols);
		System.out.println(result.toString());
		return ResultGenerator.genSuccessResult(map);
	}

}
