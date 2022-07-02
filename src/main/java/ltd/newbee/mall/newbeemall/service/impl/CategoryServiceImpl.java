package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.CategoryMapper;
import ltd.newbee.mall.newbeemall.entity.Category;
import ltd.newbee.mall.newbeemall.service.CategoryService;
import ltd.newbee.mall.newbeemall.vo.CategoryListVo;


@Service
public class CategoryServiceImpl implements CategoryService {
	@Resource
	CategoryMapper egCategoryMapper;

//	@Override
//	public List<Category> findCategoryById(Integer categoryById) {
//		List<Category> list = egCategoryMapper.selectGoodsDetail(categoryById);
//		return list;
//	}

	@Override
	public List<CategoryListVo> findCategoryById(Integer categoryById) {
		// 取出所有的内容
		List<Category> entityList = egCategoryMapper.selectGoodsDetail(categoryById);
		// 创建一个需要返回的vo展示集合对象
		List<CategoryListVo> voList = new ArrayList<>();
		//所有内容进行遍历
		for (Category entity : entityList) {
			//找出一级分类，赋值到vo类，加入到集合中去
			if (entity.getCategoryParent() == null) {
				CategoryListVo vo = new CategoryListVo();
				//BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
				BeanUtils.copyProperties(entity,vo);
				//为一级分类设置子分类
				vo.setSubList(getChildrens(vo,entityList));
				voList.add(vo);
			}
		}
		return voList;
	}
	
	public List<CategoryListVo> getChildrens(CategoryListVo root, List<Category> entityList) {
		//由于子分类下可能还有子分类，因此依旧需要创建一个需要返回的vo展示集合对象
	    List<CategoryListVo> voList = new ArrayList<>();   
	    //依旧将所有内容进行遍历
	    for (Category entity : entityList) {
	    	//取出相应子类，加到集合中并返回
	    	if (root.getCategoryId().equals(entity.getCategoryParent())) {
				CategoryListVo vo = new CategoryListVo();
				BeanUtils.copyProperties(entity,vo);
				//使用递归，循序渐进式设置完各大小级分类
				vo.setSubList(getChildrens(vo,entityList));
				//最总加入到集合中去
				voList.add(vo);
			}
	    }
	    return voList;
	}


}
