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
	private String pricutreUrl;
	public String getPictureId() {
		return pictureId;
	}
	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}
	public String getPricutreUrl() {
		return pricutreUrl;
	}
	public void setPricutreUrl(String pricutreUrl) {
		this.pricutreUrl = pricutreUrl;
	}
	
}
