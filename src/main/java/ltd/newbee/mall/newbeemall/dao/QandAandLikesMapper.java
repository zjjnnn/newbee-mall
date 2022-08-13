package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Qa;

public interface QandAandLikesMapper {
	List<Qa> getQandAandLikes(Long goodsId, String orderBy);

	int insertNewQuestion(Map<String, Object> question);

}
