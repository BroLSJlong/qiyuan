package com.team7.qiyuan.entity;

import java.io.Serializable;

public class User implements Serializable{
	/**昵称*/
	private String userName;
	/**真实姓名*/
	private String realName;
	/**年龄*/
	private String age;
	/**性别*/
	private String sex;
	/**身份证*/
	private String idCard;
	/**出生日期*/
	private String born;
	/**用户所在地区*/
	private String area;
	/**用户头像*/
	private String imgId;
	/**个人简介*/
	private String description;
	/**喜欢的食物*/
	private String food;
	/**孩子*/
	private String kids;
	/**状态 (1.单身 2.未婚 3.离异)*/
	private String state;
	/**身高*/
	private String height;
	/**主要语言*/
	private String language;
	/**用户电话*/
	private String userPhone;
	
	public User() {
		super();
	}

	public User(String userName, String realName, String age, String sex, String idCard, String born, String area,
			String imgId, String description, String food, String kids, String state, String height, String language,
			String userPhone) {
		super();
		this.userName = userName;
		this.realName = realName;
		this.age = age;
		this.sex = sex;
		this.idCard = idCard;
		this.born = born;
		this.area = area;
		this.imgId = imgId;
		this.description = description;
		this.food = food;
		this.kids = kids;
		this.state = state;
		this.height = height;
		this.language = language;
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getKids() {
		return kids;
	}

	public void setKids(String kids) {
		this.kids = kids;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", realName=" + realName + ", age=" + age + ", sex=" + sex + ", idCard="
				+ idCard + ", born=" + born + ", area=" + area + ", imgId=" + imgId + ", description=" + description
				+ ", food=" + food + ", kids=" + kids + ", state=" + state + ", height=" + height + ", language="
				+ language + ", userPhone=" + userPhone + "]";
	}
	
	
}
