package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.GoodsFeatures;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;

public interface CategoryItemsMapper {
	List<NewBeeMallGoods> selectAllCategoryItems(long leve2Cate,String orderBy, int start,int num,String sort);
	
	// 0 得到大条件col_name
	List<GoodsFeatures> selectColName(long leve2Cate);
	
	//1 得到goodsIdList
	//得到当前二级category下，小条件col筛选后的goods_id
	List<NewBeeMallGoods> selectGoodsIdList(long leve2Cate,List<String> colList);
	
	//得到所有二级category下的商品
	List<NewBeeMallGoods> selectAllCategoryItems(long leve2Cate);

	//2 得到category名以及每个category下的商品数量
	List<GoodsCategory> selectCategoryAndCountGoods(List<Long> goodsIdList);
	
	
	//3 得到小条件col以及每个小条件下的商品数量
	List<GoodsFeatures> selectColAndCountGoodsPreCol(List<Long> goodsIdList);
	
	//4 根据筛选后的goods_id，得到页面所需的商品信息
	List<NewBeeMallGoods> selectCategoryItemInfo(List<Long> goodsIdList,String orderBy,String sort, int start,int num);
}
