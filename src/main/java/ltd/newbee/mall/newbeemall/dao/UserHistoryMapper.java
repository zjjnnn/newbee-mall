package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface UserHistoryMapper {
	List<TbNewbeeMallGoodsInfo> selectGoodsDetail(int userId);
}
