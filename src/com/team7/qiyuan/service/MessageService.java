package com.team7.qiyuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.Message;
import com.team7.qiyuan.mapper.MessageMapper;

@Service
public class MessageService {
	
	@Autowired
	private MessageMapper messageMapper;
	
	public boolean addMessage(Message message) {
		return messageMapper.addMessage(message);
	}

	public boolean deleteByIdCard(String idCard) {
		return messageMapper.deleteByIdCard(idCard);
	}

	public List<Message> selectMessage(String idCard){
		return messageMapper.selectList(idCard);
	}
}
