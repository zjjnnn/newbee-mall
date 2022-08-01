package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.SkuDataMapper;
import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.service.SkuDataService;
import ltd.newbee.mall.newbeemall.vo.SkuDataVO;

@Service
public class SkuDataServiceImpl implements SkuDataService {

	@Resource
	SkuDataMapper skuDataMapper;

	@Override
	public SkuDataVO getSkuDataAndSizeAndColorList(long goodsId, String size, String color) {
		// 取该size的颜色列表
		List<SkuColor> colorList = skuDataMapper.getSkuColorList(goodsId, size);
		String resultColor = colorList.get(0).getColor();

		for (SkuColor skuColor : colorList) {
			if (skuColor.getColor().equals(color)) {
				resultColor = color;
			}
		}

		SkuDataVO resultSkuDataVO = skuDataMapper.getSkuFromGoodsId(goodsId, size, resultColor);
		resultSkuDataVO.setSkuColorList(colorList);
		resultSkuDataVO.setSkuSizeList(skuDataMapper.getSkuSizeList(goodsId));

		return resultSkuDataVO;
	}
}
