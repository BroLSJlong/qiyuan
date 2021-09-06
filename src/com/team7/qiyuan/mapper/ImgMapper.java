package com.team7.qiyuan.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.team7.qiyuan.entity.Dynamic;
import com.team7.qiyuan.entity.Img;
import com.team7.qiyuan.entity.Test;

@CacheNamespace
public interface ImgMapper {
	
	/*增加图片*/
	@Insert("insert into imgtable(imgId ,idCard) value(#{imgId},#{idCard})")
	boolean imgAdd(Img img);
	
	/*删除图片*/
	@DeleteProvider(type = ImgProvider.class, method = "deleteSql")
	boolean imgDelete(Serializable imgId);
	
	@Delete("delete from imgtable where imgId=#{imgId}")
	boolean delete(String imgId);
	
	/*修改图片*/
	@Update("update imgtable set(#{imgId} , #{idCard})")
	boolean imgUpdate(Img img);
	
	/*查找图片*/
	@SelectProvider(type = ImgProvider.class , method = "getListSql")
	List<Img> imgSelect(Img img);
	
	@Select("select imgtable.imgId,idCard,dynamicdetailtable.dynamicId FROM imgtable LEFT JOIN dynamicdetailtable ON imgtable.imgId=dynamicdetailtable.imgId")
	List<Test> list();
	
	@Select("select imgId from imgtable where idCard = #{idCard}")
	List<Img> selectUserImg(String idCard);
}
