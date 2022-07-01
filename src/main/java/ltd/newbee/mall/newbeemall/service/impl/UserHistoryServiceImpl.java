package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.UserHistoryMapper;
import ltd.newbee.mall.newbeemall.entity.Sku;
import ltd.newbee.mall.newbeemall.service.UserHistoryService;

@Service
public class UserHistoryServiceImpl implements UserHistoryService {

	@Resource
	UserHistoryMapper egUserHistoryMapper;

	@Override
	public List<Sku> findUserHistoryBySkuId(int userId) {
		List<Sku> list = egUserHistoryMapper.selectGoodsDetail(userId);
		return list;
	}

}
