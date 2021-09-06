package com.team7.qiyuan.mapper;


@CacheNamespace
public interface DynamicMapper {

	@Insert("insert into dynamictable(dynamicId,idCard,content,time,thumb) values(#{dynamicId},#{idCard},#{content},#{time},#{thumb})")
	boolean add(Dynamic dynamic);
	
	@Delete("delete from dynamictable where dynamicId=#{dynamicId}")
	boolean delete(String dynamicId);
	
	@Select("select dynamicId,idCard,content,time,thumb from dynamictable where idCard=#{idCard} order by time asc")
	List<Dynamic> select(Dynamic dynamic);
	
	@Select("select dynamicId,idCard,content,time,thumb from dynamictable order by time*1 desc")
}