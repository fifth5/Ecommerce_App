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
	 * introduction 目录介绍
	 */
	private String introduction;
	/**
	 * categoryType 目录类型，保留字段
	 */
	private String categoryType;
	/**
	 * childCates 子目录
	 */
	private List<Category> childCates;
	
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
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public List<Category> getChildCates() {
		return childCates;
	}
	public void setChildCates(List<Category> childCates) {
		this.childCates = childCates;
	}
	
}
