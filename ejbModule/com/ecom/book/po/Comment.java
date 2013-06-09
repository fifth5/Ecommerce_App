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
	 * username 用户名，在加入用户后应替换为用户类
	 */
	private String username;
	/**
	 * time 评论时间
	 */
	private Date time;
	/**
	 * userIP 用户IP地址
	 */
	private String userIP;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getUserIP() {
		return userIP;
	}
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}
	
}
