package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.ItemListsVO;

public interface ItemListsService {

	List<ItemListsVO> findItemListsByCategoryId(int categoryId);

}
