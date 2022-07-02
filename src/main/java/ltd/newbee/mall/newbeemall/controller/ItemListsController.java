package ltd.newbee.mall.newbeemall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.dao.ECGoodsCategoryMapper;
import ltd.newbee.mall.newbeemall.entity.ECGoodsCategory;
import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ItemListsController {

	@Resource
	ItemListsService itemListsService;
	@Resource
	ECGoodsCategoryMapper ecGoodsCategoryMapper;

	@RequestMapping(value = "/itemLists/{category}", method = RequestMethod.GET)
	@ResponseBody
	public Result queryProduct(@PathVariable("category") String categoryName) {
		List<ECGoodsCategory> list = ecGoodsCategoryMapper.selectGoodsCategory();
		int categoryId = 0;
		for (ECGoodsCategory ecGoodsCategory : list) {
			if (ecGoodsCategory.getCategoryName().equals(categoryName)) {
				categoryId = ecGoodsCategory.getCategoryId();
			}
		}
		return ResultGenerator.genSuccessResult(itemListsService.findItemListsByCategoryId(categoryId));
	}
}
