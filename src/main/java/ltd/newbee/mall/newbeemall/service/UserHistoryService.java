package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.NewSku;

public interface UserHistoryService{
	List<NewSku> findUserHistoryBySkuId(int userId);
}
