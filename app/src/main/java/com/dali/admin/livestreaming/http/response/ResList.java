package com.dali.admin.livestreaming.http.response;


import java.io.Serializable;
import java.util.List;


public class ResList<T>  implements Serializable {

	private int pageIndex;
	private int pageSize;
	public int totalCount;

	private List<T> items;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "ResList{" +
				"currentPage=" + pageIndex +
				", totalRow=" + pageSize +
				", totalPage="  +
				", items=" + items +
				'}';
	}
}
