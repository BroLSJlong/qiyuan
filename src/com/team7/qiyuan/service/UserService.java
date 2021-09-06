package com.team7.qiyuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team7.qiyuan.entity.User;
import com.team7.qiyuan.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public boolean delete(String idCard) {
		return userMapper.delete(idCard);
	}
	
	public boolean update(User user) {
		return userMapper.update(user);
	}
	
	public boolean add(User user) {
		user.setUserName("");
		user.setRealName("");
		user.setAge("0");
		user.setSex("男");
		user.setBorn("");
		user.setArea("");
		user.setDescription("");
		user.setFood("");
		user.setKids("0");
		user.setState("");
		user.setHeight("");
		user.setLanguage("Chinese");
		user.setUserPhone("");
		return userMapper.insert(user);
	}
	
	public List<User> select(User user){
		return userMapper.select(user);
	}
	
	public String userNum(){
		return userMapper.userNum();
	}

}
