package com.team7.qiyuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.Dynamic;
import com.team7.qiyuan.entity.Img;
import com.team7.qiyuan.entity.Test;
import com.team7.qiyuan.mapper.ImgMapper;

@Service
public class ImgService {
	@Autowired
	private ImgMapper imgMapper;
	
	public boolean insert(Img img) {
		return imgMapper.imgAdd(img);
	}
	
	public boolean delete(String imgId) {
		return imgMapper.delete(imgId);
	}
	
	public List<Img> select(Img img) {
		return imgMapper.imgSelect(img);
	}
	
	public List<Test> list() {
		List<Test> test = imgMapper.list();
		return  test;
	}
	
	public List<Img> selectUserImg(String idCard){
		return imgMapper.selectUserImg(idCard);
	}
}
