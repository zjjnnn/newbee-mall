package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewSku;

public interface ECGoodsDetailMapper {
	List<NewSku> selectGoodsDetail(int configType);
}
