package com.team7.qiyuan.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team7.qiyuan.entity.Account;
import com.team7.qiyuan.mapper.AccountMapper;

@Service
@RequestMapping("AccountSerive")
public class AccountSerive {
	@Autowired
	private AccountMapper accountMapper ;
	
	//增加用户
	public boolean accountAdd(Account account) {
		System.out.println(1);
		return accountMapper.accoundAdd(account);
	}
	
	//删除用户
	public boolean accountDelte(Serializable phone) {
		return accountMapper.accountDelete(phone);
	}
	
	//修改用户账号
	public boolean accountUpdate(Account account) {
		return accountMapper.accountUpdate(account);
	}
	
	//登录查询
	public Account accountSignin(Account obj) {
		return accountMapper.accountSignin(obj) ;
	}
	
	//查找本人账号信息
	public Account accountSelectByPhone(Serializable phone) {
		return accountMapper.accountSelectByPhone(phone);
	}
	
	//查找全部账号信息
	public List<Account> accountSelectAll(Account user) {
		return accountMapper.accountSelectAll(user);
	}
}
