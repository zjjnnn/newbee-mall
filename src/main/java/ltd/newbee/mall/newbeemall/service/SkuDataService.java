package ltd.newbee.mall.newbeemall.service;

import ltd.newbee.mall.newbeemall.vo.SkuDataVO;

public interface SkuDataService {
	SkuDataVO getSkuDataAndSizeAndColorList(long goodsId, String size, String color);
}
