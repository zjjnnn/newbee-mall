package ltd.newbee.mall.newbeemall.util;

import java.util.HashMap;
import java.util.Map;

public class PageQueryUtil extends HashMap<String, Object> {

	private HashMap<String, Object> params;
	private Long goodsCategoryId;
	private String orderBy;
	private String ascOrDesc;
	private Long pageNo;
	private Long limit;
	private Long offSet;

	public PageQueryUtil() {
	}

	public PageQueryUtil(Map<String, Object> params) {
		this.params = (HashMap<String, Object>) params;
		this.goodsCategoryId = ((Number) params.get("goodsCategoryId")).longValue();
		this.orderBy = (String) params.get("orderBy");
		this.ascOrDesc = (String) params.get("ascOrDesc");
		this.pageNo = ((Number) params.get("pageNo")).longValue();
		this.limit = ((Number) params.get("limit")).longValue();

		this.put("goodsCategoryId", goodsCategoryId);
		this.put("orderBy", orderBy);
		this.put("ascOrDesc", ascOrDesc);
		this.put("pageNo", pageNo);
		this.put("limit", limit);
		this.put("offSet", (pageNo - 1) * limit);
	}

	public Long getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(HashMap<String, Object> params) {
		this.goodsCategoryId = ((Number) params.get("goodsCategoryId")).longValue();
		this.put("goodsCategoryId", goodsCategoryId);
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(HashMap<String, Object> params) {
		this.orderBy = (String) params.get(orderBy);
		this.put("orderBy", orderBy);
	}

	public String getAscOrDesc() {
		return ascOrDesc;
	}

	public void setAscOrDesc(HashMap<String, Object> params) {
		this.ascOrDesc = (String) params.get(ascOrDesc);
		this.put("ascOrDesc", ascOrDesc);
	}

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(HashMap<String, Object> params) {
		this.pageNo = ((Number) params.get("pageNo")).longValue();
		this.put("pageNo", pageNo);
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(HashMap<String, Object> params) {
		this.limit = ((Number) params.get("limit")).longValue();
		this.put("limit", limit);
	}
	public Long getOffSet() {
		return offSet;
	}

	public void setOffSet(HashMap<String, Object> params) {
		this.pageNo = ((Number) params.get("pageNo")).longValue();
		this.limit = ((Number) params.get("limit")).longValue();
		this.put("offSet", (pageNo - 1) * limit);
	}
}
