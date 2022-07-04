package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface UserHistoryService{
	List<TbNewbeeMallGoodsInfo> findUserHistoryBySkuId(int userId);
}
