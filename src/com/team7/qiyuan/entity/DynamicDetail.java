package com.team7.qiyuan.entity;

import java.io.Serializable;

public class DynamicDetail implements Serializable{
	/**动态id*/
	private String dynamicId;
	/**图片id*/
	private String imgId;
	
	public DynamicDetail() {}

	public DynamicDetail(String dynamicId, String imgId) {
		super();
		this.dynamicId = dynamicId;
		this.imgId = imgId;
	}

	public String getDynamicId() {
		return dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	@Override
	public String toString() {
		return "DynamicDetail [dynamicId=" + dynamicId + ", imgId=" + imgId + "]";
	}
	
}
