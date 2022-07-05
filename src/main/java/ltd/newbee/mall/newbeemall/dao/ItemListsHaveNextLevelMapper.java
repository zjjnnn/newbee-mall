package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.ItemListsVO;
import ltd.newbee.mall.newbeemall.vo.NextLevelCategoryNameAndCountVO;

public interface ItemListsHaveNextLevelMapper {
	List<ItemListsVO> getItemListsByCategoryId(int categoryId, String orderBy, String ascOrDesc, int limitIndex);

	List<NextLevelCategoryNameAndCountVO> getSubCategoryNameAndNumsOfGoods(int categoryId);
}
