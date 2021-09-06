package com.team7.qiyuan.util;

import java.io.File;

import javax.imageio.ImageIO;

import org.springframework.web.multipart.MultipartFile;

public class ImgUpLoadUtil {
	public static final String logoImg = "team7-logo.png";
	public static String upLoad(MultipartFile img){
		String fileName = null;
		try {
			if(!img.isEmpty() && null != ImageIO.read(img.getInputStream())) {
				fileName = img.getOriginalFilename();
				System.out.println(fileName);
				fileName = UUIDUtil.getUUID() + fileName.substring(fileName.lastIndexOf("."));
				File file = new File("C:/upload/qiyuan",fileName);
				file.createNewFile();
				img.transferTo(file);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return fileName;
	}
	
	public static String isAddLog(String imgId) {
		if(StrUtil.isEmpty(imgId)) {
			return logoImg;
		}else return imgId;
	}
}
