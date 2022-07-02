package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.CategorySkuListVo;

public interface CategorySkuService{
	List<CategorySkuListVo> findCategorySkuById(Long categorySkuId,String orderBy, String ascOrDesc);
	
	List<CategorySkuListVo> findCategorySkuById();
}
