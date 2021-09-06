package com.team7.qiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.team7.qiyuan.entity.DynamicDetail;
import com.team7.qiyuan.service.DynamicDetailService;
import com.team7.qiyuan.util.ImgUpLoadUtil;
import com.team7.qiyuan.util.StrUtil;

@Controller
@RequestMapping("DynamicDetailController")
public class DynamicDetailController {
	@Autowired
	private DynamicDetailService dynamicDetailService;
	
	/** 添加 */
	@RequestMapping("add.do")
	@ResponseBody
	public String add(MultipartFile img, DynamicDetail dynamicDetail){
			String imgId = ImgUpLoadUtil.upLoad(img);
			if(!StrUtil.isEmpty(imgId)){
				dynamicDetail.setImgId(imgId);
				dynamicDetailService.add(dynamicDetail);
			}
			return imgId;
	}
	
	@RequestMapping("delete.do")
	@ResponseBody
	public boolean delete(String imgId) {
		return dynamicDetailService.delete(imgId);
	}
	
	@RequestMapping("deleteId.do")
	@ResponseBody
	public boolean deleteId(String dynamicId) {
		System.out.println(dynamicId);
		return dynamicDetailService.deleteId(dynamicId);
	}
	
	@RequestMapping("select.do")
	@ResponseBody
	public List<DynamicDetail> select(String dynamicId) {
		return dynamicDetailService.select(dynamicId);
	}
	
}
