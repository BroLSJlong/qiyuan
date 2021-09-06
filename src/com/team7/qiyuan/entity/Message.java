package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Message implements Serializable{
	/**用户id*/
	private String idCard;
	/**留言用户id*/
	private String messageIdCard;
	/**留言内容*/
	private String message;
	/**留言时间*/
	private String messageTime;
	
	public Message() {	}

	public Message(String idCard, String messageIdCard, String message, String messageTime) {
		super();
		this.idCard = idCard;
		this.messageIdCard = messageIdCard;
		this.message = message;
		this.messageTime = messageTime;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getMessageIdCard() {
		return messageIdCard;
	}

	public void setMessageIdCard(String messageIdCard) {
		this.messageIdCard = messageIdCard;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
	}

	@Override
	public String toString() {
		return "Message [idCard=" + idCard + ", messageIdCard=" + messageIdCard + ", message=" + message
				+ ", messageTime=" + messageTime + "]";
	}
	
}
