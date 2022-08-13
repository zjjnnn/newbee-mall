package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.CReview;

public interface SkuReviewMapper {
	List<CReview> getReviewsDataByGoodsId(Long goodsId);
}
