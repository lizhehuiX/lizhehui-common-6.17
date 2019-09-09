package com.lizhehui.common.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class aa {


	public static void main(String[] args) {
		String time = "2019-07-31 23:59:59";
		String dateType = "yyyy-MM-dd HH:mm:ss";

		System.out.println(stringConversionDate(time, dateType));
	}

	static public Date stringConversionDate(String time, String dateType) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateType.trim().toString());
		Date date = null;
		try {
			date = formatter.parse(time);
		} catch (ParseException e) {
			System.out.println("格式错误 ,error[ time:" + time + " 与 dateType:" + dateType + " 格式不同，无法转换]");
			return null;
		}
		return date;
	}
}
