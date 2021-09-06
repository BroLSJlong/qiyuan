package com.team7.qiyuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.team7.qiyuan.entity.DynamicTalk;

@CacheNamespace
public interface TalkMapper {
	
	@Insert("insert into dynamicTalktable(dynamicId,idCard,talkContent, talkTime) values(#{dynamicId},#{idCard},#{talkContent},#{talkTime})")
	boolean add(DynamicTalk dynamicTalk);
	
	@Delete("delete from dynamicTalktable where talkTime = #{time}")
	boolean deleteByTime(String time);
	
	@Select("select dynamicId,idCard,talkContent,talkTime from dynamictalktable where dynamicId = #{dynamicId}")
	List<DynamicTalk> selectTalk(DynamicTalk dynamicTalk);
	
	@Delete("delete from dynamicTalktable where dynamicId = #{dynamicId}")
	boolean deleteId(String dynamicId);
}
