package com.team7.qiyuan.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.Friend;
import com.team7.qiyuan.mapper.FriendMapper;



@Service
public class FriendService {
	@Autowired
	private FriendMapper friendMapper;
	
	/**添加好友*/
	public boolean add(Friend friend) {
		return friendMapper.add(friend);
	}

	/**删除好友*/
	public boolean deleteById(Friend friend) {
		return friendMapper.deleteById(friend);
	}
	
	/**查询所有*/
	public List<Friend> list(Serializable idCard) {
		return friendMapper.list(idCard);
	}
}
