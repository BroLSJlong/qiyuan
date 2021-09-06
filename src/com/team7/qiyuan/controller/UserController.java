package com.team7.qiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.team7.qiyuan.entity.User;
import com.team7.qiyuan.service.UserService;
import com.team7.qiyuan.util.ImgUpLoadUtil;
import com.team7.qiyuan.util.StrUtil;

@Controller
@RequestMapping("UserController")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("addUser.do")
	@ResponseBody
	public boolean addUser(User user) {
		user.setImgId(ImgUpLoadUtil.isAddLog(user.getImgId()));
		return userService.add(user);
	}
	
	@RequestMapping("deleteUser.do")
	@ResponseBody
	public boolean deleteUser(String idCard) {
		return userService.delete(idCard);
	}
	
	@RequestMapping("updateUser.do")
	@ResponseBody
	public boolean updateUser(User user) {
		return userService.update(user);
	}
	
	@RequestMapping("selectuserName.do")
	@ResponseBody
	public User selectuserName(User user) {
		return userService.select(user).get(0);
	}
	
	
	@RequestMapping("selectUser.do")
	@ResponseBody
	public List<User> selectUser(User user) {
		return userService.select(user);
	}
	
	@RequestMapping("userNum.do")
	@ResponseBody
	public String userNum() {
		return userService.userNum();
	}
	
	@RequestMapping("changeHeadImg.do")
	@ResponseBody
	public String changeHeadImg(MultipartFile img,User user) {
		String imgId = ImgUpLoadUtil.upLoad(img);
		if(!StrUtil.isEmpty(imgId)){
			user.setImgId(imgId);
			userService.update(user);
		}
		return imgId;
	}
}
