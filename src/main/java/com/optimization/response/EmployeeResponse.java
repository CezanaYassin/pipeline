package com.optimization.response;

import java.util.List;

import com.optimization.entity.EmployeeEntity;

public class EmployeeResponse {
	private List<EmployeeEntity>content;
	private int pageNo;
	private int pageSize;
	private long totalElements;
	private int totalPages;
	private boolean isFirst;
	private boolean isLast;
	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<EmployeeEntity> getContent() {
		return content;
	}
	public void setContent(List<EmployeeEntity> content) {
		this.content = content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isFirst() {
		return isFirst;
	}
	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public EmployeeResponse(List<EmployeeEntity> content, int pageNo, int pageSize, int totalElements, int totalPages,
			boolean isFirst, boolean isLast) {
		super();
		this.content = content;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.isFirst = isFirst;
		this.isLast = isLast;
	}
	
	

}
