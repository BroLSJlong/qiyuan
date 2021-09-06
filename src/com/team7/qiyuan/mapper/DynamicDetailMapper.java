package com.team7.qiyuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.team7.qiyuan.entity.DynamicDetail;

@CacheNamespace
public interface DynamicDetailMapper {

	@Insert("insert into dynamicdetailtable(dynamicId,imgId) values(#{dynamicId},#{imgId})")
	boolean add(DynamicDetail dynamicDetail);
	
	@Delete("delete from dynamicdetailtable where imgId=#{imgId}")
	boolean delete(String imgId);
	
	@Select("select dynamicId,imgId from dynamicdetailtable where dynamicId=#{dynamicId}")
	List<DynamicDetail> select(String dynamicId);

	@Delete("delete from dynamicdetailtable where dynamicId=#{dynamicId}")
	boolean deleteId(String dynamicId);
}
