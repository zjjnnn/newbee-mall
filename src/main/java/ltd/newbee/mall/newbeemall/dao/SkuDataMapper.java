package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.SkuColor;
import ltd.newbee.mall.newbeemall.vo.SkuDataVO;

public interface SkuDataMapper {
	SkuDataVO getSkuFromGoodsId(long goodsId, String size, String color);

	List<String> getSkuSizeList(long goodsId);

	List<SkuColor> getSkuColorList(long goodsId, String size);
}
