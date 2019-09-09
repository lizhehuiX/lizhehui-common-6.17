package com.lizhehui.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TTest {

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
