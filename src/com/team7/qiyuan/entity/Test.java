package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Test implements Serializable{
	/**
	 * 接受小工具类
	 * */
	private String imgId;

	private String idCard;
	
	private String dynamicId;
	
	public Test() {	}
	public Test(String imgId, String idCard,String dynamicId) {
		super();
		this.imgId = imgId;
		this.idCard = idCard;
		this.dynamicId = dynamicId;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getDynamicId() {
		return dynamicId;
	}

	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	@Override
	public String toString() {
		return "Test [imgId=" + imgId + ", idCard=" + idCard + ", dynamicId=" + dynamicId + "]";
	}
	
}
