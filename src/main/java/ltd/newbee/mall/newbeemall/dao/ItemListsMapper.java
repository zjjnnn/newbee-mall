package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.ItemListsVO;

public interface ItemListsMapper {
	List<ItemListsVO> getItemListsByCategoryId(int categoryId, String orderBy, String ascOrDesc, int limitIndex);
}
