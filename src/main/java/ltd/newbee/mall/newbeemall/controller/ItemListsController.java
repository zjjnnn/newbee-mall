package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.ItemListsService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class ItemListsController {

	@Resource
	ItemListsService itemListsService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/itemList", method = RequestMethod.POST)
	@ResponseBody
	public Result getItemLists(@RequestBody HashMap<String, Object> map) {

		return ResultGenerator.genSuccessResult(itemListsService.findItemListsByMap(map));
	}

}
