package com.ecom.book.po;

import java.io.Serializable;

public class Goods implements Serializable{

	/**
	 * goodsId 商品主键，商品具体指图书
	 */
	private String goodsId;
	
	/**
	 * goodsNo 商品编号
	 */
	private String goodsNo;
	
	/**
	 * goodsName 商品名称
	 */
	private String goodsName;
	
	/**
	 * goodsTitle 商品标题
	 */
	private String goodsTitle;
	
	/**
	 * goodsInfo 商品简介
	 */
	private String goodsInfo;
	
	/**
	 * price 商品定价
	 */
	private double price;
	
	/**
	 * currentPrice 商品售价
	 */
	private double currentPrice;
	
	/**
	 * stock 商品库存
	 */
	private int stock;
	
	/**
	 * picture 商品图片
	 */
	private Picture pictures;
	
	/**
	 * category 商品类别
	 */
	private Category categorys;
	
	public String getGoodsId() {
		return goodsId;
	}
	
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	
	public String getGoodsNo() {
		return goodsNo;
	}
	
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsInfo() {
		return goodsInfo;
	}
	
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Picture getPictures() {
		return pictures;
	}
	
	public void setPictures(Picture pictures) {
		this.pictures = pictures;
	}
	
	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public Category getCategorys() {
		return categorys;
	}
	
	public void setCategorys(Category categorys) {
		this.categorys = categorys;
	}
}
