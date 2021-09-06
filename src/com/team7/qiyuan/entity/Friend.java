package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Friend implements Serializable{
	/**身份证id*/
	private String idCard;
	/**朋友身份证*/
	private String fIdCard;

	public Friend() {}

	public Friend(String idCard, String fIdCard) {
		super();
		this.idCard = idCard;
		this.fIdCard = fIdCard;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getfIdCard() {
		return fIdCard;
	}

	public void setfIdCard(String fIdCard) {
		this.fIdCard = fIdCard;
	}

	@Override
	public String toString() {
		return "Friend [idCard=" + idCard + ", fIdCard=" + fIdCard + "]";
	}
	
}
