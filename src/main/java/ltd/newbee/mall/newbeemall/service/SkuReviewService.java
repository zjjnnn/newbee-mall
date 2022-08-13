package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.CReview;

public interface SkuReviewService {
	List<CReview> getReviewsDataByGoodsId(Long goodsId);
}
