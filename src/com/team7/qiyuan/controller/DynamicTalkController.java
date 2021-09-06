package com.team7.qiyuan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.team7.qiyuan.entity.DynamicTalk;
import com.team7.qiyuan.service.DynamicTalkService;

@Controller
@RequestMapping("DynamicTalkController")
public class DynamicTalkController {
	@Autowired
	private DynamicTalkService dynamicTalkService;
	
	/** 添加 */
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(DynamicTalk dynamicTalk){
		return dynamicTalkService.add(dynamicTalk);
	}
	
	/** 删除 */
	@RequestMapping("deletetime.do")
	@ResponseBody
	public boolean deleteById(String time){
		return dynamicTalkService.deleteByTime(time);
	}
	
	/** 删除 */
	@RequestMapping("deleteId.do")
	@ResponseBody
	public boolean deleteId(String dynamicId){
		return dynamicTalkService.deleteId(dynamicId);
	}
	
	/**查找动态对应的评论*/
	@RequestMapping("selectTalk.do")
	@ResponseBody
	public List<DynamicTalk> selectTalk(DynamicTalk dynamicTalk){
		return dynamicTalkService.selectTalk(dynamicTalk);
	}
	
	
}
