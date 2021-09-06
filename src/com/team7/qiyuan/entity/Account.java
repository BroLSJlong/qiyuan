package com.team7.qiyuan.entity;

import java.io.Serializable;

public class Account implements Serializable{
	/**身份证֤*/
	private String idCard;
	/**电话号码（主键）*/
	private String phone;
	/**密码*/
	private String pwd;
	
	public Account() {	}

	public Account(String idCard, String phone, String pwd) {
		super();
		this.idCard = idCard;
		this.phone = phone;
		this.pwd = pwd;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Account [idCard=" + idCard + ", phone=" + phone + ", pwd=" + pwd + "]";
	}
	
}
