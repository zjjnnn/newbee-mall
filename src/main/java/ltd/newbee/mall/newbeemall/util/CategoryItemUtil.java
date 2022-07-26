package ltd.newbee.mall.newbeemall.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryItemUtil extends HashMap<String, Object>{
	private HashMap<String, Object> params;
	private Long leve2Cate;
	private String orderBy;
	private String sort;
	private Integer pageNo;
	private Integer start;
	private Integer num;
	private HashMap<String, List<String>> filterCols;
	
	public CategoryItemUtil(Map<String,Object> params) {
		this.params=(HashMap<String, Object>) params;
		this.leve2Cate=((Number) params.get("leve2Cate")).longValue();
		this.orderBy=(String) params.get("orderBy");
		this.sort=(String) params.get("sort");
		this.pageNo = ((Number) params.get("pageNo")).intValue();
		this.num = ((Number) params.get("num")).intValue();
		
		this.filterCols = (HashMap<String, List<String>>) params.get("filterCols");	
		
		this.putAll(params);
		this.put("start",(pageNo-1)*num );
	}
	
}
