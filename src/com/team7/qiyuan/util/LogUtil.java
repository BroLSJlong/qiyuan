package com.team7.qiyuan.util;

import org.apache.log4j.Logger;

public class LogUtil {
	public static Logger getLogger() {
		/*
		StackTraceElement[] ss = Thread.currentThread().getStackTrace();
		for(int i = 0; i < ss.length; i++) {
			System.out.println(ss[i] + "="+ i);
		}*/
		return Logger.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
}
