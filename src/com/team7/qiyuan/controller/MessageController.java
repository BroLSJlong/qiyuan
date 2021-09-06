package com.team7.qiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team7.qiyuan.entity.Message;
import com.team7.qiyuan.service.MessageService;
import com.team7.qiyuan.util.DateUtil;

@Controller
@RequestMapping("MessageController")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("add.do")
	@ResponseBody
	public boolean addMessage(Message message) {
		message.setMessageTime(DateUtil.getNow(DateUtil.DATE_YMDHMS3));
		return messageService.addMessage(message);
	}
	
	@RequestMapping("list.do")
	@ResponseBody
	public List<Message> listMessage(String idCard){
		List<Message> list = messageService.selectMessage(idCard);
		messageService.deleteByIdCard(idCard);
		return list;
	}
}
