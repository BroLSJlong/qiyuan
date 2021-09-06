package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Dynamic implements Serializable{
	/**动态id*/
	private String dynamicId;
	/**身份证id*/
	private String idCard;
	/**内容*/
	private String content;
	/**时间*/
	private String time;
	/**点赞数*/
	private String thumb;
	
	public Dynamic() {	}

	public Dynamic(String dynamicId, String idCard, String content, String time, String thumb) {
		super();
		this.dynamicId = dynamicId;
		this.idCard = idCard;
		this.content = content;
		this.time = time;
		this.thumb = thumb;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	@Override
	public String toString() {
		return "Dynamic [dynamicId=" + dynamicId + ", idCard=" + idCard + ", content=" + content + ", time=" + time
				+ ", thumb=" + thumb + "]";
	}
	
}
