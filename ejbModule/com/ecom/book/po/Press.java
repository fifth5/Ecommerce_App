package com.ecom.book.po;

import java.io.Serializable;
import java.util.Set;

public class Press implements Serializable{

	/**
	 * pressId 出版社编号
	 */
	private String pressId;
	/**
	 * pressName 出版社名称
	 */
	private String pressName;
	/**
	 * introduction 出版社简介
	 */
	private String introduction;
	/**
	 * books 出版社出的书
	 */
	private Set<ProductBook> books;
	
	public String getPressId() {
		return pressId;
	}
	public void setPressId(String pressId) {
		this.pressId = pressId;
	}
	public String getPressName() {
		return pressName;
	}
	public void setPressName(String pressName) {
		this.pressName = pressName;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Set<ProductBook> getBooks() {
		return books;
	}
	public void setBooks(Set<ProductBook> books) {
		this.books = books;
	}
	
}
