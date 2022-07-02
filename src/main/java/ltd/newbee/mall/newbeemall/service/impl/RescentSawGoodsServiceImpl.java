package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RescentSawGoodsMapper;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.RescentSawGoodsService;

@Service
public class RescentSawGoodsServiceImpl implements RescentSawGoodsService {

	@Resource
	RescentSawGoodsMapper rescentSawGoodsMapper;

	@Override
	public List<NewBeeMallGoods> findRescentSawGoodsBySkuId(long userId) {
		List<NewBeeMallGoods> list = rescentSawGoodsMapper.selectGoodsDetail(userId);
		return list;
	}

}
