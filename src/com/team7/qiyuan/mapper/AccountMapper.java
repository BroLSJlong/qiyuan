package com.team7.qiyuan.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.team7.qiyuan.entity.Account;

@CacheNamespace
public interface AccountMapper {
	
	/*增加用户*/
	@Insert("insert into accounttable(phone,idCard,pwd) values(#{phone},#{idCard},#{pwd})")
	boolean accoundAdd(Account account);
	
	/*删除用户*/
	@Delete("delete FROM accounttable where phone = #{phone}")
	boolean accountDelete(Serializable phone);
	
	/*修改用户*/
	@Update("update accounttable set idCard = #{idCard} , pwd = #{pwd} where phone = #{phone}")
	boolean accountUpdate(Account account);
	
	/*登录查询*/
	@Select("select idCard , phone, pwd from accounttable where phone = #{phone} and pwd = #{pwd} ")
	Account accountSignin(Account account);
	
	/*查询单个用户*/
	@Select("select idCard , phone, pwd from accounttable WHERE phone = #{phone}")
	Account accountSelectByPhone(Serializable phone);
	
	/*查询所有用户*/
	@Select("select idCard,phone ,pwd from accounttable ")
	List<Account> accountSelectAll(Account obj);
}
