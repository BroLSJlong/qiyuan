package com.team7.qiyuan.util;

import java.util.UUID;

/**
 * è·å– 32 ä½é•¿çš„UUIDå€?
 * @author lsy
 * email: lsy@lanqiao.org
 * 2021å¹?7æœ?3æ—?
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
