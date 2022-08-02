package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

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
		SkuDataVO resultSkuDataVO = new SkuDataVO();
		List<SkuColor> colorList = new ArrayList<>();
		if (size == null || size.equals("")) {
			resultSkuDataVO = skuDataMapper.getSkuFirstTime(goodsId);
			colorList = skuDataMapper.getSkuColorList(goodsId, resultSkuDataVO.getSize());
		} else {
			// 取该size的颜色列表
			colorList = skuDataMapper.getSkuColorList(goodsId, size);
			String resultColor = colorList.get(0).getColor();

			for (SkuColor skuColor : colorList) {
				if (color != null && skuColor.getColor().equals(color)) {
					resultColor = color;
				}
			}
			resultSkuDataVO = skuDataMapper.getSkuFromGoodsId(goodsId, size, resultColor);
		}

		JSONObject jsonImg = JSONObject.parseObject(resultSkuDataVO.getImg());
		List<String> imgList = JSON.parseArray(jsonImg.getJSONArray("img").toJSONString(), String.class);
		JSONObject jsonIcon = JSONObject.parseObject(resultSkuDataVO.getFeatureIcon());
		List<String> iconList = JSON.parseArray(jsonIcon.getJSONArray("featureIcon").toJSONString(), String.class);

		resultSkuDataVO.setImgList(imgList);
		resultSkuDataVO.setFeatureIconList(iconList);
		resultSkuDataVO.setColorList(colorList);
		resultSkuDataVO.setSizeList(skuDataMapper.getSkuSizeList(goodsId));

		return resultSkuDataVO;
	}
}
