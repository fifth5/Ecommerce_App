package com.ecom.book.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ProductBook implements Serializable{

	/**
	 * productbookId 图书详细信息编号
	 */
	private String productbookId;
	/**
	 * isbn 图书ISBN号
	 */
	private String isbn;
	/**
	 * publishDate 出版日期
	 */
	private Date publishDate;
	/**
	 * publishCount 版次
	 */
	private int publishCount;
	/**
	 * pageNbr 页数
	 */
	private int pageNbr;
	/**
	 * wordNbr 字数
	 */
	private float wordNbr;
	/**
	 * printDate 印刷日期
	 */
	private Date printDate;
	/**
	 * bookSize 开本
	 */
	private String booksize;
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
	 * bookcategory 图书目录
	 */
	private String bookcategrory;
	/**
	 * preview 试读章节
	 */
	private String preview;
	/**
	 * introduction 图书介绍
	 */
	private String introduction;
	/**
	 * authors 作者
	 */
	private Set<Author> authors;
	/**
	 * presses 出版社
	 */
	private Set<Press> presses;
	/**
	 * comments 图书评论
	 */
	private List<Comment> comments;
	/**
	 * product 商品信息
	 */
	private Product product;
	
	public String getProductbookId() {
		return productbookId;
	}
	public void setProductbookId(String productbookId) {
		this.productbookId = productbookId;
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
	public int getPublishCount() {
		return publishCount;
	}
	public void setPublishCount(int publishCount) {
		this.publishCount = publishCount;
	}
	public int getPageNbr() {
		return pageNbr;
	}
	public void setPageNbr(int pageNbr) {
		this.pageNbr = pageNbr;
	}
	public float getWordNbr() {
		return wordNbr;
	}
	public void setWordNbr(float wordNbr) {
		this.wordNbr = wordNbr;
	}
	public Date getPrintDate() {
		return printDate;
	}
	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}
	public String getBooksize() {
		return booksize;
	}
	public void setBooksize(String booksize) {
		this.booksize = booksize;
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
	public String getBookcategrory() {
		return bookcategrory;
	}
	public void setBookcategrory(String bookcategrory) {
		this.bookcategrory = bookcategrory;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	public Set<Press> getPresses() {
		return presses;
	}
	public void setPresses(Set<Press> presses) {
		this.presses = presses;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
