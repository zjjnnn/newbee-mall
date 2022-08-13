package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import ltd.newbee.mall.newbeemall.dao.SkuReviewMapper;
import ltd.newbee.mall.newbeemall.entity.CReview;
import ltd.newbee.mall.newbeemall.service.SkuReviewService;

@Service
public class SkuReviewServiceImpl implements SkuReviewService {

	@Resource
	SkuReviewMapper skuReviewMapper;

	@Override
	public List<CReview> getReviewsDataByGoodsId(Long goodsId) {
		List<CReview> result = skuReviewMapper.getReviewsDataByGoodsId(goodsId);
		for (CReview cReview : result) {
			if (cReview.getImgs() != null) {
				JSONObject jsonImg = JSONObject.parseObject(cReview.getImgs());
				List<String> imgList = JSON.parseArray(jsonImg.getJSONArray("imgs").toJSONString(), String.class);
				cReview.setImgList(imgList);
			} else {
				List<String> emptyList = new ArrayList<>();
				cReview.setImgList(emptyList);
			}
		}
		return result;
	}
}
