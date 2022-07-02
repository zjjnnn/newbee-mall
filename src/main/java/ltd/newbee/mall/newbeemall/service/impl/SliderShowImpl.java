package ltd.newbee.mall.newbeemall.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.SliderShowMapper;
import ltd.newbee.mall.newbeemall.entity.SliderShow;
import ltd.newbee.mall.newbeemall.service.SliderShowService;
import ltd.newbee.mall.newbeemall.vo.SliderShowListVo;

@Service
public class SliderShowImpl implements SliderShowService {

	@Resource
	SliderShowMapper egSliderShowMapper;

	@Override
	public List<SliderShowListVo> findSliderShowId(Integer sliderShowId) {
		// 取出所有的内容
		List<SliderShow> entityList = egSliderShowMapper.selectGoodsDetail(sliderShowId);

		// 创建一个需要返回的vo展示集合对象
		List<SliderShowListVo> voList = new ArrayList<>();
		// 所有内容进行遍历
		for (SliderShow entity : entityList) {
			// 赋值到vo类，加入到集合中去
			SliderShowListVo vo = new SliderShowListVo();
			// BeanUtils.copyProperties(A,B)方法是将A中的值赋给B
			BeanUtils.copyProperties(entity, vo);
			// 把每项添加进voList
			voList.add(vo);
		}

		return voList;
	}
}
