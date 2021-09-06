package com.team7.qiyuan.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.team7.qiyuan.entity.Img;
import com.team7.qiyuan.entity.Test;
import com.team7.qiyuan.service.ImgService;
import com.team7.qiyuan.util.ImgUpLoadUtil;
import com.team7.qiyuan.util.StrUtil;

@Controller
@RequestMapping("ImgController")
public class ImgController {
	@Autowired
	private ImgService imgService;

	@RequestMapping("upLoadImg.do")
	@ResponseBody
	private boolean upLoadImg(MultipartFile img, String idCard) throws IOException {
		String imgId = ImgUpLoadUtil.upLoad(img);
		if(!StrUtil.isEmpty(imgId)){
			return imgService.insert(new Img(imgId,idCard));
		}else return false;
	}
	
	@RequestMapping("list.do")
	@ResponseBody
	public List<Test> list() {
		return imgService.list();
	}
	
	@RequestMapping("selectUserImg.do")
	@ResponseBody
	public List<Img> selectUserImg(String idCard){
		return imgService.selectUserImg(idCard);
	}
	
	
	@RequestMapping("delete.do")
	@ResponseBody
	public boolean deleteImg(String imgId) {
		return imgService.delete(imgId);
	}
	
}