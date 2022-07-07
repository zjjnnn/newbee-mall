package ltd.newbee.mall.newbeemall.service;

import java.util.HashMap;

import ltd.newbee.mall.newbeemall.vo.ItemListsAndCountVO;

public interface ItemListsService {

	ItemListsAndCountVO findItemListsByMap(HashMap<String, Object> keyWordsMap);

}
