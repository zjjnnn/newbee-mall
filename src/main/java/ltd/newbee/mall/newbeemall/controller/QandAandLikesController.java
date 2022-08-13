package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.QandAandLikesService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class QandAandLikesController {

	@Resource
	QandAandLikesService qandAandLikesService;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/QandA", method = RequestMethod.GET)
	@ResponseBody
	public Result getQandAList(Long goodsId, String orderBy, int pageNum) {
//		List<Qa> qa = qandAandLikesService.getQandAandLikes(goodsId, orderBy, pageNum);
		return ResultGenerator.genSuccessResult(qandAandLikesService.getQandAandLikes(goodsId, orderBy, pageNum));
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/QandA", method = RequestMethod.POST)
	@ResponseBody
	public Result insertNewQuestion(@RequestBody HashMap<String, Object> question) {
		return ResultGenerator.genSuccessResult(qandAandLikesService.insertNewQuestion(question));
	}
}
