package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;

public interface CategoryInfoMapper {
	List<TbNewbeeMallGoodsInfo> selectCategoryInfo(Long goodsCategoryId,String orderBy, String ascOrDesc,Long offsetId);
	
	List<TbNewbeeMallGoodsInfo> selectCategoryCount(Long goodsCategoryId);

}
