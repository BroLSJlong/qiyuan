package com.team7.qiyuan.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team7.qiyuan.entity.Account;
import com.team7.qiyuan.service.AccountSerive;

@Controller
@RequestMapping("AccountController")
public class AccountController {
	@Autowired
	private AccountSerive accountSerive; 
	
	/*新增用户*/
	@RequestMapping("accountAdd.do")
	@ResponseBody
	public boolean accountAdd(Account account) {
		return accountSerive.accountAdd(account);
	}
	
	/*删除用户*/
	@RequestMapping("accountDelete.do")
	@ResponseBody
	public boolean accountDelete(Serializable phone) {
		return accountSerive.accountDelte(phone);
	}
	
	/*修改用户*/
	@RequestMapping("accountUpdate.do")
	public boolean accountUpdate(Account account) {
		return accountSerive.accountUpdate(account);
	}
	
	/*登录查询*/
	@RequestMapping("accountSignin.do")
	@ResponseBody
	public Account accountSignin(Account account) {
		return accountSerive.accountSignin(account);
	}
	
	/*通过电话号码获取用户*/
	@ResponseBody
	@RequestMapping("accountselectByPhone.do")
	public Account accountSelectByPhone(Serializable phone) {
		return accountSerive.accountSelectByPhone(phone);
	}
	
	/*查找全部用户*/
	@RequestMapping("accountSelecAll.do")
	@ResponseBody
	public List<Account> accountSelectAll(Account user) {
		return accountSerive.accountSelectAll(user);
	}
}
