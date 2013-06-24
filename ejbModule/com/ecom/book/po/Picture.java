package com.ecom.book.po;

import java.io.Serializable;

public class Picture implements Serializable{

	/**
	 * pictureId 图片编号
	 */
	private String pictureId;
	
	/**
	 * pictureUrl 图片链接
	 */
	private String pictureUrl;
	
	/**
	 * pictureInfo 图片信息
	 */
	private String pictureInfo;
	
	public String getPictureId() {
		return pictureId;
	}
	
	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}
	
	public String getPictureUrl() {
		return pictureUrl;
	}
	
	public String getPictureInfo() {
		return pictureInfo;
	}

	public void setPictureInfo(String pictureInfo) {
		this.pictureInfo = pictureInfo;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}	
}
