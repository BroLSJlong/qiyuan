package com.team7.qiyuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.Dynamic;
import com.team7.qiyuan.entity.User;
import com.team7.qiyuan.mapper.DynamicMapper;
import com.team7.qiyuan.util.DateUtil;
import com.team7.qiyuan.util.UUIDUtil;

@Service
public class DynamicService {
	@Autowired
	private DynamicMapper dynamicMapper;
	
	public boolean add(Dynamic dynamic ) {
		dynamic.setTime(DateUtil.getNow(DateUtil.DATE_YMDHMS2));
		
		return dynamicMapper.add(dynamic);
	}
	
	public boolean delete(String dynamicId ) {
		return  dynamicMapper.delete(dynamicId);
	}
	
	public List<Dynamic> select(Dynamic dynamic) {
		return  dynamicMapper.select(dynamic);
	}
	
	/*查询单个*/
	public List<Dynamic> selectOne(Dynamic dynamic) {
		return dynamicMapper.selectOne(dynamic);
	}
	
	public List<Dynamic> list(Dynamic dynamic) {
		return  dynamicMapper.list(dynamic);
	}
	
	public String dynamicNum(){
		return dynamicMapper.dynamicNum();
	}
	
	public String dynamicNumTalkNum(){
		return dynamicMapper.dynamicNumTalkNum();
	}
	
	/*修改动态表信息（点赞数）*/
	public boolean update(Dynamic dynamic) {
		return dynamicMapper.update(dynamic);
	}
	
	/*查询用户最新发布的动态*/
	public List<Dynamic> selectTime(Dynamic dynamic) {
		return  dynamicMapper.selectTime(dynamic);
	}
}
