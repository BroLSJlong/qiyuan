package com.team7.qiyuan.mapper;import java.util.List;import org.apache.ibatis.annotations.CacheNamespace;import org.apache.ibatis.annotations.Delete;import org.apache.ibatis.annotations.Insert;import org.apache.ibatis.annotations.Select;import org.apache.ibatis.annotations.Update;import com.team7.qiyuan.entity.Dynamic;import com.team7.qiyuan.entity.User;


@CacheNamespace
public interface DynamicMapper {

	@Insert("insert into dynamictable(dynamicId,idCard,content,time,thumb) values(#{dynamicId},#{idCard},#{content},#{time},#{thumb})")
	boolean add(Dynamic dynamic);
	
	@Delete("delete from dynamictable where dynamicId=#{dynamicId}")
	boolean delete(String dynamicId);
		/*查询*/	@Select("select dynamicId,idCard,content,time,thumb from dynamictable where dynamicId=#{dynamicId}")	List<Dynamic> selectOne(Dynamic dynamic);	
	@Select("select dynamicId,idCard,content,time,thumb from dynamictable where idCard=#{idCard} order by time asc")
	List<Dynamic> select(Dynamic dynamic);
	
	@Select("select dynamicId,idCard,content,time,thumb from dynamictable order by time*1 desc")	List<Dynamic> list(Dynamic dynamic);		@Select("select COUNT(dynamicId) FROM dynamictable")	String dynamicNum();		@Select("select SUM(thumb) FROM dynamictable")	String dynamicNumTalkNum();		@Update("update dynamictable set thumb = #{thumb}  where dynamicId = #{dynamicId} ")	boolean update(Dynamic dynamic);		/*查询用户最新发布的动态*/	@Select("select dynamicId , idCard , content, time , thumb from dynamictable where time= (select max(time) from dynamictable where idCard = #{idCard})")	List<Dynamic> selectTime(Dynamic dynamic);
}
