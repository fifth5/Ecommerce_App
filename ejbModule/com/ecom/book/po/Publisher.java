package com.ecom.book.po;

import java.io.Serializable;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

public class Publisher implements Serializable{

	/**
	 * publisherId 出版社编号
	 */
	private String publisherId;
	
	/**
	 * publisherName 出版社名称
	 */
	private String publisherName;
	
	/**
	 * publisherInfo 出版社简介
	 */
	private String publisherInfo;
	
	/**
	 * books 出版社出的书
	 */
	private Set<Book> books;
	
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public String getPublisherInfo() {
		return publisherInfo;
	}
	
	public void setPublisherInfo(String publisherInfo) {
		this.publisherInfo = publisherInfo;
	}
	
	@JSON(serialize=false)
	public Set<Book> getBooks() {
		return books;
	}
	
	public void setBooks(Set<Book> books) {
		this.books = books;
	}	
}
