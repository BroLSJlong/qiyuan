package com.team7.qiyuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.DynamicDetail;
import com.team7.qiyuan.mapper.DynamicDetailMapper;
import com.team7.qiyuan.util.UUIDUtil;

@Service
public class DynamicDetailService {
	@Autowired
	private DynamicDetailMapper dynamicDetailMapper;
	
	public boolean add(DynamicDetail dynamicDetail) {
		return  dynamicDetailMapper.add(dynamicDetail);
	}
	
	public boolean delete(String imgId ) {
		
		return  dynamicDetailMapper.delete(imgId);
	}
	
	public List<DynamicDetail> select(String dynamicId) {
		List<DynamicDetail> dynamic = dynamicDetailMapper.select(dynamicId);
		return  dynamic;
	}

	public boolean deleteId(String dynamicId) {
		return dynamicDetailMapper.deleteId(dynamicId);
	}
	
}