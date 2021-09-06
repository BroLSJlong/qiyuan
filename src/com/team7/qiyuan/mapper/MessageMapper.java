package com.team7.qiyuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.team7.qiyuan.entity.Message;

@CacheNamespace
public interface MessageMapper {
	@Insert("insert into messagetable(idCard,messageIdCard,message,messageTime) values(#{idCard},#{messageIdCard},#{message},#{messageTime})")
	boolean addMessage(Message message);

	@Delete("delete from  messagetable where idCard = #{idCard}")
	boolean deleteByIdCard(String idCard);
	
	@Select("select idCard,messageIdCard,message,messageTime from messagetable where idCard = #{idCard}")
	List<Message> selectList(String idCard);
}
