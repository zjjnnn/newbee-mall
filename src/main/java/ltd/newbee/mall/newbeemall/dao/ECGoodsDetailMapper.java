package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface ECGoodsDetailMapper {
	List<NewBeeMallGoods> selectGoodsDetail(int configType);
}
