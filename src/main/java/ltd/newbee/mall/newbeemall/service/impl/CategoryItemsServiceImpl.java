package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CategoryItemsMapper;
import ltd.newbee.mall.newbeemall.entity.GoodsCategory;
import ltd.newbee.mall.newbeemall.entity.GoodsFeatures;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.CategoryItemsService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.util.CategoryItemUtil;
import ltd.newbee.mall.newbeemall.vo.FeatureColVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;
@Service
public class CategoryItemsServiceImpl implements CategoryItemsService {

	@Resource
	CategoryItemsMapper categoryItemsMapper;

	@Override
	public HashMap<String, Object> getCategoryItems(CategoryItemUtil cateParams) {

		List<Long> goodsIdList=new ArrayList<>();
		
//		Long leve2Cate=(Long) cateParams.get("leve2Cate");

Long leve2Cate = ((Integer)cateParams.get("leve2Cate")).longValue();
		
		HashMap<String, List<String>> filterCols=(HashMap<String, List<String>>) cateParams.get("filterCols");
		
		if(!filterCols.isEmpty()) {
			List<Long> goodsIdList2=new ArrayList<>();
			filterCols.forEach((k,v)->{
				List<NewBeeMallGoods> colList=categoryItemsMapper.selectGoodsIdList(leve2Cate,v);
				//HashSet不允许有重复元素
				HashSet<Long> setId =new HashSet<>();
				for(NewBeeMallGoods goodsId:colList) {
					setId.add(goodsId.getGoodsId());
				}
				goodsIdList2.addAll(setId);
			});
			HashMap<Long,Integer> goodsIdMap= new HashMap<>();
			for(Long k:goodsIdList2) {
				Integer cot=goodsIdMap.get(k);
				goodsIdMap.put(k, (cot==null)? 1:cot++);
				if(goodsIdMap.get(k)==filterCols.size()) {
					goodsIdList.add(k);
				}
			}
		}else {
			List<NewBeeMallGoods> colList=categoryItemsMapper.selectAllCategoryItems(leve2Cate);
			HashSet<Long> setId =new HashSet<>();
			for(NewBeeMallGoods goodsId:colList) {
				setId.add(goodsId.getGoodsId());
			}
			goodsIdList.addAll(setId);
		}
		
		List<GoodsCategory> cateList=categoryItemsMapper.selectCategoryAndCountGoods(goodsIdList);
		List<NewBeeMallIndexCategoryVO> cateVoList =BeanUtil.copyList(cateList, NewBeeMallIndexCategoryVO.class);
		
		List<GoodsFeatures> colEntityList=categoryItemsMapper.selectColAndCountGoodsPreCol(goodsIdList);
		HashSet<String> colNames =new HashSet<>();
		for(GoodsFeatures entity:colEntityList) {
			colNames.add(entity.getColName());
		}
		
		List<String> colNameList=new ArrayList<>();
		colNameList.addAll(colNames);
		
		List<Object> featureCountList=new ArrayList<>();
		for(String colName:colNameList ) {
			HashMap<String,Object> colNameMap =new HashMap<String,Object>();
			colNameMap.put("colName",colName);
			
			List<FeatureColVO> feaVoList=new ArrayList<>();
			for(GoodsFeatures e:colEntityList) {
				if(colName.equals(e.getColName())) {
					FeatureColVO vo=new FeatureColVO();
					BeanUtils.copyProperties(e,vo);
					feaVoList.add(vo);
				}
			}
			colNameMap.put("featureList",feaVoList);
			featureCountList.add(colNameMap);
		}
			
		String orderBy= (String) cateParams.get("orderBy");
		String sort= (String) cateParams.get("sort");
		Integer pageNo= (Integer) cateParams.get("pageNo");
		Integer num= (Integer) cateParams.get("num");
		Integer start= (Integer) cateParams.get("start");
		List<NewBeeMallGoods> goodsInfoList=categoryItemsMapper.selectCategoryItemInfo(goodsIdList, orderBy, sort, start, num);
		List<NewBeeMallGoodsDetailVO> infoVoList =BeanUtil.copyList(goodsInfoList, NewBeeMallGoodsDetailVO.class);
		
		int ItemCount=goodsIdList.size();
		
		HashMap<String, Object> finalList=new HashMap<String, Object>();
		
		finalList.put("itemInfoList",infoVoList);
		finalList.put("featureList",featureCountList);
		finalList.put("categoryList", cateVoList);
		finalList.put("ItemCount", ItemCount);
		
		
		return finalList;
	}

}
