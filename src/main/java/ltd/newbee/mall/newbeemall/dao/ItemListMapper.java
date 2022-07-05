package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.TbNewbeeMallGoodsInfo;
import ltd.newbee.mall.newbeemall.util.PageQueryUtil;

public interface ItemListMapper {
	List<TbNewbeeMallGoodsInfo> selectItemList(Long goodsCategoryId,String orderBy, String ascOrDesc,Long offsetId);
	
	//只能查询第3层 map
	List<TbNewbeeMallGoodsInfo> selectItemListCount(Long goodsCategoryId);
	
	List<TbNewbeeMallGoodsInfo> selectItemListParam(Long goodsCategoryId,String orderBy, String ascOrDesc,Long limit,Long offSet);
	
	
	////增强版 可以同时查询2层和3层
//	List<TbNewbeeMallGoodsInfo> selectItemListSubParam(Long goodsCategoryId,String orderBy, String ascOrDesc,Long limit,Long offSet);
	List<TbNewbeeMallGoodsInfo> selectItemListSubParam(PageQueryUtil pageParamsSub);
//	List<TbNewbeeMallGoodsInfo> selectItemListSubCount(Long goodsCategoryId);
	List<TbNewbeeMallGoodsInfo> selectItemListSubCount(PageQueryUtil pageParamsSub);

}
