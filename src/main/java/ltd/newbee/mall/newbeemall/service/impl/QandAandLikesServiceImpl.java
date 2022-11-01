package ltd.newbee.mall.newbeemall.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.QandAandLikesMapper;
import ltd.newbee.mall.newbeemall.entity.Qa;
import ltd.newbee.mall.newbeemall.service.QandAandLikesService;

@Service
public class QandAandLikesServiceImpl implements QandAandLikesService {

	@Resource
	QandAandLikesMapper qandAandLikesMapper;

	@Override
	public List<Qa> getQandAandLikes(Long goodsId, String orderBy, int pageNum) {
		List<Qa> qa = qandAandLikesMapper.getQandAandLikes(goodsId, orderBy);
		List<Qa> result = new ArrayList<>();
		for (int i = (pageNum - 1) * 3; pageNum * 3 > qa.size() ? i < qa.size() : i < pageNum * 3; i++) {
			result.add(qa.get(i));
		}
		result.get(0).setQuestionCount(qa.size());
		return result;
	}

	@Override
	public List<Qa> insertNewQuestion(HashMap<String, Object> question) {
		question.put("status", 1);
		question.put("userId", ((int) (Math.random() * (9999999 - 1000000) + 1000000)));
		Date questionDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		question.put("qDate", ft.format(questionDate));
		qandAandLikesMapper.insertNewQuestion(question);
		long goodsId = ((Integer) question.get("goodsId")).longValue();
		return getQandAandLikes(goodsId, (String) question.get("orderBy"), 1);
	}

	@Override
	public List<Qa> insertLike(long goodsId, long questionId, String orderBy) {
		long userId = (long) (Math.random() * (9999999 - 1000000) + 1000000);
		Date questionDate = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String date = ft.format(questionDate);
		qandAandLikesMapper.insertLike(userId, questionId, date);
		return getQandAandLikes(goodsId, orderBy, 1);
	}
}
