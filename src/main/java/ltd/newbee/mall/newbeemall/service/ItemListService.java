package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.util.PageQueryUtil;
import ltd.newbee.mall.newbeemall.vo.ItemListVo;

public interface ItemListService {
	HashMap<String, Object> findCategoryInfoById(Long goodsCategoryId, String orderBy, String ascOrDesc, Long pageNo);

	HashMap<String, Object> findItemListThird(PageQueryUtil pageParams);

	//增强版 可以同时查询2层和3层
	HashMap<String, Object> findItemListSub(PageQueryUtil pageParamsSub);

}
