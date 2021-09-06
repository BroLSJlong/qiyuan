package com.team7.qiyuan.mapper;

import com.team7.qiyuan.entity.User;
import com.team7.qiyuan.util.StrUtil;

public class UserProvider {
	public String selectSql(User user) {
		StringBuffer sql = new StringBuffer("select userPhone, userName,realName,age,sex,idCard,born,userPhone,area,imgId,description,food,kids,state,height,language from usertable where 1=1 ");
		if(null != user) {
			if(!StrUtil.isEmpty(user.getUserName())) {
				sql.append("and userName like concat('%',#{userName},'%') ");
			}
			if(!StrUtil.isEmpty(user.getRealName())) {
				sql.append("and realName like concat('%',#{realName},'%') ");
			}
			if(!StrUtil.isEmpty(user.getAge())) {
				sql.append("and age=#{age} ");
			}
			if(!StrUtil.isEmpty(user.getSex())) {
				sql.append("and sex=#{sex} ");
			}
			if(!StrUtil.isEmpty(user.getUserPhone())) {
				sql.append("and userPhone=#{userPhone} ");
			}
			if(!StrUtil.isEmpty(user.getIdCard())) {
				sql.append("and idCard=#{idCard} ");
			}
			if(!StrUtil.isEmpty(user.getBorn())) {
				sql.append("and born=#{born} ");
			}
			if(!StrUtil.isEmpty(user.getArea())) {
				sql.append("and area like concat('%',#{area},'%') ");
			}
			if(!StrUtil.isEmpty(user.getImgId())) {
				sql.append("and imgId=#{imgId} ");
			}
			if(!StrUtil.isEmpty(user.getDescription())) {
				sql.append("and description like concat('%',#{description},'%') ");
			}
			if(!StrUtil.isEmpty(user.getFood())) {
				sql.append("and food like concat('%',#{food},'%') ");
			}
			if(!StrUtil.isEmpty(user.getKids())) {
				sql.append("and kids=#{kids} ");
			}
			if(!StrUtil.isEmpty(user.getState())) {
				sql.append("and state=#{state} ");
			}
			if(!StrUtil.isEmpty(user.getHeight())) {
				sql.append("and height=#{height} ");
			}
			if(!StrUtil.isEmpty(user.getLanguage())) {
				sql.append("and language=#{language} ");
			}
		}
		return sql.toString();
	}
	
	public String updateSql(User user) {
		StringBuffer sql = new StringBuffer("update usertable set idCard=#{idCard} ");
		if(null != user) {
			if(!StrUtil.isEmpty(user.getUserName())) {
				sql.append(",userName=#{userName} ");
			}
			if(!StrUtil.isEmpty(user.getRealName())) {
				sql.append(",realName=#{realName} ");
			}
			if(!StrUtil.isEmpty(user.getAge())) {
				sql.append(",age=#{age} ");
			}
			if(!StrUtil.isEmpty(user.getSex())) {
				sql.append(",sex=#{sex} ");
			}
			if(!StrUtil.isEmpty(user.getBorn())) {
				sql.append(",born=#{born} ");
			}
			if(!StrUtil.isEmpty(user.getArea())) {
				sql.append(",area=#{area} ");
			}
			if(!StrUtil.isEmpty(user.getDescription())) {
				sql.append(",description=#{description} ");
			}
			if(!StrUtil.isEmpty(user.getKids())) {
				sql.append(",kids=#{kids} ");
			}
			if(!StrUtil.isEmpty(user.getState())) {
				sql.append(",state=#{state} ");
			}
			if(!StrUtil.isEmpty(user.getHeight())) {
				sql.append(",height=#{height} ");
			}
			if(!StrUtil.isEmpty(user.getLanguage())) {
				sql.append(",language=#{language} ");
			}
			if(!StrUtil.isEmpty(user.getUserPhone())) {
				sql.append(",userPhone=#{userPhone} ");
			}
			if(!StrUtil.isEmpty(user.getFood())) {
				sql.append(",food=#{food} ");
			}
			if(!StrUtil.isEmpty(user.getFood())) {
				sql.append(",food=#{food} ");
			}
			if(!StrUtil.isEmpty(user.getImgId())) {
				sql.append(",imgId=#{imgId} ");
			}
		}
		sql.append("where idCard=#{idCard}");
		return sql.toString();
	}
}
