package com.ecom.book.po;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * productId 商品主键，商品具体指图书
	 */
	private String productId;
	/**
	 * productNo 商品编号
	 */
	private String productNo;
	/**
	 * productName 商品名称
	 */
	private String productName;
	/**
	 * introduction 商品简介
	 */
	private String introduction;
	/**
	 * price 商品定价
	 */
	private double price;
	/**
	 * sellPrice 商品售价
	 */
	private double sellPrice;
	/**
	 * stock 商品库存
	 */
	private int stock;
	/**
	 * productInfo 商品具体信息
	 */
	private ProductBook productInfo;
	/**
	 * picture 商品缩略图
	 */
	private Picture picture;
	/**
	 * category 商品类别
	 */
	private Category categorys;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public ProductBook getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductBook productInfo) {
		this.productInfo = productInfo;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public Category getCategorys() {
		return categorys;
	}
	public void setCategorys(Category categorys) {
		this.categorys = categorys;
	}
	
}
