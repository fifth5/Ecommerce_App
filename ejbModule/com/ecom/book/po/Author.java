package com.ecom.book.po;

import java.util.Set;

public class Author {

	/**
	 * authorId 作者编号
	 */
	private String authorId;
	/**
	 * authorName 作者姓名
	 */
	private String authorName;
	/**
	 * nationality 国籍
	 */
	private String nationality;
	/**
	 * introduction 作者简介
	 */
	private String introduction;
	/**
	 * books 某一作者写的书
	 */
	private Set<ProductBook> books;
	
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
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
