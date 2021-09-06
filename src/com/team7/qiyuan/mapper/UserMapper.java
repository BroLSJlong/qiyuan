package com.team7.qiyuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.team7.qiyuan.entity.User;

@CacheNamespace
public interface UserMapper {
	
	@Insert("insert usertable(userName,realName,age,sex,idCard,born,area,imgId,description,food,kids,state,height,language)"
			+ "values(#{userName},#{realName},#{age},#{sex},#{idCard},#{born},#{area},#{imgId},#{description},#{food},#{kids},#{state},#{height},#{language})")
	boolean insert(User user);
	
	@SelectProvider(type = UserProvider.class,method = "selectSql")
	List<User> select(User user);
	
	@Delete("delete from usertable where idCard=#{idCard}")
	boolean delete(String idCard);
	
	@UpdateProvider(type = UserProvider.class,method = "updateSql")
	boolean update(User user);
	
	@Select("select COUNT(idCard) FROM usertable")
	String userNum();
}
