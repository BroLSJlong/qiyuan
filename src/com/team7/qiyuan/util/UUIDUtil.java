package com.team7.qiyuan.util;

import java.util.UUID;

/**
 * 获取 32 位长的UUID�?
 * @author lsy
 * email: lsy@lanqiao.org
 * 2021�?7�?3�?
 */
public class UUIDUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	/*
	public static void main(String[] args) {
		getUUID();
	}*/
}
