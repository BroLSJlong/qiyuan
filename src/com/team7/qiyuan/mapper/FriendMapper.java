package com.team7.qiyuan.mapper;


import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.team7.qiyuan.entity.Friend;

@CacheNamespace
public interface FriendMapper {
	
	@Insert("insert into friendtable(idCard,fIdCard) values(#{idCard},#{fIdCard})")
	boolean add(Friend friend); 
	
	@Delete("delete from friendtable where fIdCard in (#{fIdCard},#{idCard}) and idCard in (#{idCard},#{fIdCard})")
	boolean deleteById(Friend friend);

	@Select("select fIdCard,null as 'idCard' from friendtable where idCard = #{idCard} UNION ALL select IdCard,null as 'idCard' from friendtable where fIdCard = #{idCard}")
	List<Friend> list(Serializable idCard);

}
