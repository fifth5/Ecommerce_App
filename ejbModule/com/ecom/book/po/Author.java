package com.ecom.book.po;

import java.io.Serializable;
import java.util.Set;

public class Author implements Serializable {

	/**
	 * authorId 作者编号
	 */
	private String authorId;
	
	/**
	 * authorName 作者姓名
	 */
	private String authorName;
	
	/**
	 * authorNation 国籍
	 */
	private String authorNation;
	
	/**
	 * authorInfo 作者简介
	 */
	private String authorInfo;
	
	/**
	 * books 某一作者写的书
	 */
	private Set<Book> books;
	
	public String getAuthorId() {
		return authorId;
	}
	
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getAuthorNation() {
		return authorNation;
	}
	
	public void setAuthorNation(String authorNation) {
		this.authorNation = authorNation;
	}
	
	public String getAuthorInfo() {
		return authorInfo;
	}
	
	public void setAuthorInfo(String authorInfo) {
		this.authorInfo = authorInfo;
	}
	
	public Set<Book> getBooks() {
		return books;
	}
	
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}
