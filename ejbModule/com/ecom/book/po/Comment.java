package com.ecom.book.po;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable{

	/**
	 * commentId 评论编号
	 */
	private String commentId;
	
	/**
	 * content 评论内容
	 */
	private String content;
	
	/**
	 * userName 用户名，在加入用户后应替换为用户类
	 */
	private String userName;
	
	/**
	 * time 评论时间
	 */
	private Date commentTime;
	
	/**
	 * userIP 用户IP地址
	 */
	private String userIP;
	
	/**
	 * 回复评论id 用于嵌套回复， 可不用
	 */
	private String fatherCommentId;
	
	public String getFatherCommentId() {
		return fatherCommentId;
	}

	public void setFatherCommentId(String fatherCommentId) {
		this.fatherCommentId = fatherCommentId;
	}

	public String getCommentId() {
		return commentId;
	}
	
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getCommentTime() {
		return commentTime;
	}
	
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	
	public String getUserIP() {
		return userIP;
	}
	
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}
}
