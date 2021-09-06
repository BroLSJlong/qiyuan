package com.team7.qiyuan.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**日期格式：yyyyMMddHHmmss*/
	public static final String DATE_YMDHMS1 = "yyyyMMddHHmmss";
	/**日期格式：yyyy-MM-dd HH:mm:ss*/
	public static final String DATE_YMDHMS2 = "yyyy-MM-dd HH:mm:ss";
	/**日期格式：yyyy/MM/dd HH:mm:ss*/
	public static final String DATE_YMDHMS3 = "yyyy/MM/dd HH:mm:ss";
	
	/**日期格式：yyyyMMdd*/
	public static final String DATE_YMD1 = "yyyyMMdd";
	/**日期格式：yyyy-MM-dd*/
	public static final String DATE_YMD2 = "yyyy-MM-dd";
	/**日期格式：yyyy/MM/dd*/
	public static final String DATE_YMD3 = "yyyy/MM/dd";
	
	/**日期格式：yyyyMM*/
	public static final String DATE_YM1 = "yyyyMM";
	/**日期格式：yyyy-MM*/
	public static final String DATE_YM2 = "yyyy-MM";
	/**日期格式：yyyy/MM*/
	public static final String DATE_YM3 = "yyyy/MM";
	
	/**日期格式：yyyy*/
	public static final String DATE_YYYY = "yyyy";
	
	/**
	 * 获取当前日期；格式为yyyyMMddHHmmss
	 */
	public static String getNow(){
		return getNow(DATE_YMDHMS1);
	}
	
	/**
	 * 获取当前日期时间，格式由fmt指定  
	 * @param fmt 日期格式
	 */
	public static String getNow(String fmt){
		return date2str(new Date(), fmt);
	}
	
	/**
	 * 将原格式为oldFmt的日期字符串，转为新的格式newFmt
	 * @param dateStr 日期字符�?
	 * @param oldFmt 原格�?
	 * @param newFmt 新格�?
	 * @return 新格式日期字符串
	 */
	public static String dateFmt(String dateStr,String oldFmt,String newFmt){
		return date2str(str2date(dateStr, oldFmt), newFmt);
	}
	
	/**
	 * 将长整型时间转化为yyyy-MM-dd HH:mm:ss格式的日期字符串
	 * @param time  时间（长整型�?
	 * @return 格式化的日期字符�?
	 */
	public static String getFmtTime(long time) {
		return getFmtTime(time, DATE_YMDHMS1);
	}
	
	/**
	 * 将长整型时间转化为指定格式的日期字符�?
	 * @param time 时间（长整型�?
	 * @param fmt 日期格式
	 * @return 格式化的日期字符�?
	 */
	public static String getFmtTime(long time,String fmt) {
		Date date = new Date(time);
		return date2str(date, fmt);
	}
	
	//----------------------------------private-----------------------------------------
	
	/**
	 * 日期字符�?  解析�?  日期
	 * @param dateStr 日期字符�?
	 * @param fmt 解析格式
	 * @return 日期
	 */
	private static Date str2date(String dateStr , String fmt){
		if(StrUtil.isEmpty(dateStr))
			return null;
		if(StrUtil.isEmpty(fmt))
			return null;
		try {
			return getSdf(fmt).parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 日期   格式化为  日期字符�?
	 * @param date 日期
	 * @param fmt 转换格式
	 * @return 日期字符�?
	 */
	private static String date2str(Date date,String fmt){
		if(null == date)
			return "";
		if(StrUtil.isEmpty(fmt))
			return "";
		return getSdf(fmt).format(date);
	}
	
	/**
	 * 获取�?个SimpleDateFormat格式器，格式由fmt指定
	 * @param fmt 日期时间格式
	 * @return sdf 格式�?
	 */
	private static synchronized SimpleDateFormat getSdf(String fmt){
		SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateTimeInstance();
		sdf.applyPattern(fmt);
		return sdf;
	}
	
}
