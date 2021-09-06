package com.team7.qiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team7.qiyuan.entity.Dynamic;
import com.team7.qiyuan.entity.User;
import com.team7.qiyuan.service.DynamicService;
import com.team7.qiyuan.util.UUIDUtil;

@Controller
@RequestMapping("DynamicController")
public class DynamicController {
	@Autowired
	private DynamicService dynamicService;
	
	/** 添加 */
	@RequestMapping("add.do")
	@ResponseBody
	public String add(Dynamic dynamic){
		String dynamicId = UUIDUtil.getUUID();
		dynamic.setDynamicId(dynamicId);
		
		dynamicService.add(dynamic);
		System.out.println(dynamic);
		return dynamicId;
	}
	
	@RequestMapping("delete.do")
	@ResponseBody
	public boolean delete(String dynamicId) {
		return dynamicService.delete(dynamicId);
	}
	
	@RequestMapping("select.do")
	@ResponseBody
	public List<Dynamic> select(Dynamic dynamic) {
		System.out.println(dynamic);
		return dynamicService.select(dynamic);
	}
	
	@RequestMapping("list.do")
	@ResponseBody
	public List<Dynamic> list(Dynamic dynamic) {
		return dynamicService.list(dynamic);
	}
	
	@RequestMapping("dynamicNum.do")
	@ResponseBody
	public String dynamicNum() {
		return dynamicService.dynamicNum();
	}
	
	@RequestMapping("dynamicNumTalkNum.do")
	@ResponseBody
	public String dynamicNumTalkNum() {
		return dynamicService.dynamicNumTalkNum();
	}
	
	/*修改动态表信息（点赞数）*/
	@RequestMapping("updateDynamic.do")
	@ResponseBody
	public boolean updateDynamic(Dynamic dynamic) {
		return dynamicService.update(dynamic);
	}
	
	/*查询用户最新发布的动态*/
	@RequestMapping("selectTime.do")
	@ResponseBody
	public List<Dynamic> selectTime(Dynamic dynamic){
		return dynamicService.selectTime(dynamic);
	}
	
	/*查询单个*/
	@RequestMapping("selectOne.do")
	@ResponseBody
	public List<Dynamic> selectOne(Dynamic dynamic) {
		return dynamicService.selectOne(dynamic);
	}
	
}
