package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.UserHistoryMapper;
import ltd.newbee.mall.newbeemall.entity.NewSku;

import ltd.newbee.mall.newbeemall.service.UserHistoryService;

@Service
public class UserHistoryServiceImpl implements UserHistoryService {

	@Resource
	UserHistoryMapper egUserHistoryMapper;

	@Override
	public List<NewSku> findUserHistoryBySkuId(int userId) {
		List<NewSku> list = egUserHistoryMapper.selectGoodsDetail(userId);
		return list;
	}

}
