package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface RescentSawGoodsService {
	List<NewBeeMallGoods> findRescentSawGoodsBySkuId(long userId);

}
