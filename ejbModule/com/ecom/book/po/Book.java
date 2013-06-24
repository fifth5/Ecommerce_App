package com.ecom.book.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Book implements Serializable {

	/**
	 * bookId 图书详细信息编号
	 */
	private String bookId;

	/**
	 * isbn 图书ISBN号
	 */
	private String isbn;

	/**
	 * publishDate 出版日期
	 */
	private Date publishDate;

	/**
	 * publishEdition 版次
	 */
	private int publishEdition;

	/**
	 * pageCount 页数
	 */
	private int pageCount;

	/**
	 * wordCount 字数
	 */
	private long wordCount;

	/**
	 * printDate 印刷日期
	 */
	private Date printDate;

	/**
	 * bookSize 开本
	 */
	private String bookSize;

	/**
	 * paper 纸张
	 */
	private String paper;

	/**
	 * printCount 印刷次数
	 */
	private int printCount;

	/**
	 * pack 包装
	 */
	private String pack;

	/**
	 * language 语言
	 */
	private String language;

	/**
	 * recomcontent 内容推荐
	 */
	private String recomcontent;

	/**
	 * chapters 图书目录
	 */
	private String chapters;

	/**
	 * preContent 试读章节
	 */
	private String preContent;

	/**
	 * bookInfo 图书介绍
	 */
	private String bookInfo;

	/**
	 * authors 作者
	 */
	private Set<Author> authors;

	/**
	 * presses 出版社
	 */
	private Set<Publisher> publishers;

	/**
	 * comments 图书评论
	 */
	private List<Comment> comments;

	/**
	 * goods 商品信息
	 */
	private Goods goods;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPublishEdition() {
		return publishEdition;
	}

	public void setPublishEdition(int publishEdition) {
		this.publishEdition = publishEdition;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public long getWordCount() {
		return wordCount;
	}

	public void setWordCount(long wordCount) {
		this.wordCount = wordCount;
	}

	public Date getPrintDate() {
		return printDate;
	}

	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}

	public String getBookSize() {
		return bookSize;
	}

	public void setBookSize(String bookSize) {
		this.bookSize = bookSize;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public int getPrintCount() {
		return printCount;
	}

	public void setPrintCount(int printCount) {
		this.printCount = printCount;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRecomcontent() {
		return recomcontent;
	}

	public void setRecomcontent(String recomcontent) {
		this.recomcontent = recomcontent;
	}

	public String getChapters() {
		return chapters;
	}

	public void setChapters(String chapters) {
		this.chapters = chapters;
	}

	public String getPreContent() {
		return preContent;
	}

	public void setPreContent(String preContent) {
		this.preContent = preContent;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Set<Publisher> getPublishers() {
		return publishers;
	}

	public void setPublishers(Set<Publisher> publishers) {
		this.publishers = publishers;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}
