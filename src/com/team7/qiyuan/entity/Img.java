package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Img implements Serializable{
	/**图片id*/
	private String imgId;
	/**身份证*/
	private String idCard;
	
	public Img() {	}

	public Img(String imgId, String idCard) {
		super();
		this.imgId = imgId;
		this.idCard = idCard;
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

	@Override
	public String toString() {
		return "Img [imgId=" + imgId + ", idCard=" + idCard + "]";
	}
	
}
