package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.SubCategoryWithGoodsDetails;

public interface SubCategoryWithGoodsDetailsMapper {
	List<SubCategoryWithGoodsDetails> getSubCategoryWithGoodsDetails(int categoryId);
}
