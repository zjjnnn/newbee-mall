package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface CategorySkuMapper {
	List<TbNewbeeMallGoodsInfo> selectCategorySku(Long categorySkuId,String orderBy);
	
	List<TbNewbeeMallGoodsInfo> selectCategorySku();
}
