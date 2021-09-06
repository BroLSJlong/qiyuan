package com.team7.qiyuan.mapper;

import com.team7.qiyuan.entity.Img;
import com.team7.qiyuan.util.StrUtil;

public class ImgProvider {
	public String getListSql(Img img) {
		StringBuffer sql = new StringBuffer("select imgId , idCard from imgtable where 1 = 1 "); 
		if ( null != img ) {
			if (!StrUtil.isEmpty(img.getImgId())) {
				sql.append("and imgId=#{imgId} ");
			}
			if (!StrUtil.isEmpty(img.getIdCard())) {
				sql.append("and idCard=#{idCard} ");
			}
		}
		return sql.toString();
	}
	
	public String deleteSql(Img img) {
		StringBuffer sql = new StringBuffer("delete from imgtable where 1 = 1 ");
		if(null != img) {
			if(!StrUtil.isEmpty(img.getImgId())) {
				sql.append("and imgId=#{imgId} ");
			}
			if(!StrUtil.isEmpty(img.getIdCard())) {
				sql.append("and idCard=#{idCard}");
			}
		}
		return sql.toString();
	}
}
