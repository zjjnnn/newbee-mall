package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Sku;

public interface RescentSawGoodsMapper {
	List<Sku> selectGoodsDetail(long userId);

}
