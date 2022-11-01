package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Qa;

public interface QandAandLikesService {
	List<Qa> getQandAandLikes(Long goodsId, String orderBy, int pageNum);

	List<Qa> insertNewQuestion(HashMap<String, Object> question);

	List<Qa> insertLike(long goodsId, long questionId, String orderBy);
}
