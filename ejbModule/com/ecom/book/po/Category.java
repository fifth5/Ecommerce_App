package com.ecom.book.po;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable{

	/**
	 * categoryId 目录编号
	 */
	private String categoryId;
	
	/**
	 * categroyName 目录名称
	 */
	private String categoryName;
	
	/**
	 * categoryInfo 目录介绍
	 */
	private String categoryInfo;
	
	/**
	 * categoryType 目录类型，保留字段
	 */
	private String categoryType;
	
	/**
	 * fatherCateId 父目录
	 */
	private String fatherCateId;
	
	
	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryInfo() {
		return categoryInfo;
	}
	
	public void setCategoryInfo(String categoryInfo) {
		this.categoryInfo = categoryInfo;
	}
	
	public String getCategoryType() {
		return categoryType;
	}
	
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	
	public String getFatherCateId() {
		return fatherCateId;
	}
	
	public void setFatherCateId(String fatherCateId) {
		this.fatherCateId = fatherCateId;
	}
}
