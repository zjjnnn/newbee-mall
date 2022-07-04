package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.vo.CategoryInfoListVo;

public interface CategoryInfoService{
	HashMap<String, Object> findCategoryInfoById(Long goodsCategoryId,String orderBy, String ascOrDesc,Long pageNo);
	
}
