package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;

public interface RescentSawGoodsService {
	List<Sku> findRescentSawGoodsBySkuId(long userId);

}
