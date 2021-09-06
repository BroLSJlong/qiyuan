package com.team7.qiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team7.qiyuan.entity.Friend;
import com.team7.qiyuan.service.FriendService;

@Controller
@RequestMapping("FriendController")
public class FriendController {
	@Autowired
	private FriendService friendService;
	
	/** 添加好友 */
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Friend friend){
		return friendService.add(friend);
	}
	
	/** 删除好友 */
	@RequestMapping("deleteById.do")
	@ResponseBody
	public boolean deleteById(Friend friend){
		return friendService.deleteById(friend);
	}
	
	/** 查询所有好友*/
	@RequestMapping("list.do")
	@ResponseBody
	public List<Friend> list(String idCard){
		return friendService.list(idCard);
	}
	
}
