package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.ECGoodsDetailMapper;
import ltd.newbee.mall.newbeemall.dao.GoodsDetailMapper;
import ltd.newbee.mall.newbeemall.entity.NewSku;
import ltd.newbee.mall.newbeemall.service.ECGoodsDetailService;
import ltd.newbee.mall.newbeemall.service.GoodsDetailService;

@Service
public class ECGoodsDetailServiceImpl implements ECGoodsDetailService {

	@Resource
	ECGoodsDetailMapper eCGoodsDetailMapper;

	@Override
	public List<NewSku> findGoodsDetailsByGoodsId(int configType) {
		List<NewSku> list = eCGoodsDetailMapper.selectGoodsDetail(configType);
		return list;
	}

}
