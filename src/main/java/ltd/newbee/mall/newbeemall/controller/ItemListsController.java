package ltd.newbee.mall.newbeemall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.dao.ItemListsHaveNextLevelMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ItemListsController {

	@Resource
	ItemListsService itemListsService;
	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;
	@Resource
	ItemListsHaveNextLevelMapper itemListsHaveNextLevelMapper;

	@RequestMapping(value = "/itemLists/{category}/{page}/", method = RequestMethod.GET)
	@ResponseBody
	public Result getItemLists(@PathVariable("category") String categoryName, @PathVariable("page") int page,
			String orderBy, String ascOrDesc) {
		List<GoodsCategory> list = ecGoodsCategoryMapper.selectGoodsCategory();
		int categoryId = 0;
		int limitIndex = (page - 1) * 10;
		for (GoodsCategory goodsCategory : list) {
			if (goodsCategory.getCategoryName().equals(categoryName)) {
				categoryId = goodsCategory.getCategoryId();
			}
		}
		return ResultGenerator.genSuccessResult(
				itemListsService.findItemListsByCategoryId(categoryId, limitIndex, orderBy, ascOrDesc));
	}

}
