package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsCategory;

public interface CategoryMapper {
	List<TbNewbeeMallGoodsCategory> selectGoodsDetail(Integer categoryById);
}
