package com.team7.qiyuan.entity;

import java.io.Serializable;

public class DynamicTalk implements Serializable{
	/**动态id*/
	private String dynamicId;
	/**身份中*/
	private String idCard;
	/**交谈内容*/
	private String talkContent;
	/**交谈时间*/
	private String talkTime;
	
	public DynamicTalk() {	}

	public DynamicTalk(String dynamicId, String idCard, String talkContent, String talkTime) {
		super();
		this.dynamicId = dynamicId;
		this.idCard = idCard;
		this.talkContent = talkContent;
		this.talkTime = talkTime;
	}

	public String getDynamicId() {
		return dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTalkContent() {
		return talkContent;
	}

	public void setTalkContent(String talkContent) {
		this.talkContent = talkContent;
	}

	public String getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(String talkTime) {
		this.talkTime = talkTime;
	}

	@Override
	public String toString() {
		return "DynamicTalk [dynamicId=" + dynamicId + ", idCard=" + idCard + ", talkContent=" + talkContent
				+ ", talkTime=" + talkTime + "]";
	}
	
}
