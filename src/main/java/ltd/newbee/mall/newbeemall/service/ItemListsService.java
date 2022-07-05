package ltd.newbee.mall.newbeemall.service;

import ltd.newbee.mall.newbeemall.vo.ItemListsAndCountVO;

public interface ItemListsService {

	ItemListsAndCountVO findItemListsByCategoryId(int categoryId, int limitIndex, String orderBy, String ascOrDesc);

}
