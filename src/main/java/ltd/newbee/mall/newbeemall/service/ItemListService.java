package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;


import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.util.PageQueryUtil;
import ltd.newbee.mall.newbeemall.vo.ItemListVo;

public interface ItemListService{
	HashMap<String, Object> findCategoryInfoById(Long goodsCategoryId,String orderBy, String ascOrDesc,Long pageNo);

	HashMap<String, Object> findCategoryInfoParam(PageQueryUtil pageParams);
	
}
