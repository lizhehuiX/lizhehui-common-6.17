package com.lizhehui.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author ：李哲辉
 * @description:TODO
 * @date ：Created in 2019/9/8 20:02
 */
public class DateUtil {

    /**
     * 随机18到70岁生日
     * @return
     */
	public static String getBirthdayDate() {
        Calendar c = Calendar.getInstance();
        // 月份0--11
        int minb= c.getWeekYear()-18;
        int maxb= c.getWeekYear()-70;
        c.set(maxb, 0, 1);
        // 获取1980年1月1日的毫秒数
        long L = c.getTimeInMillis();
        // System.out.println(l);
        // 设置日历时间为当前的日期
        c.set(minb,0,1);
        // 当前时间的毫秒数
        long L2 = c.getTimeInMillis();
        // System.out.println(l2);
        long x = L + (long) (Math.random() * (L2 - L));
        // 用毫秒数设置为当前日历日期
        c.setTimeInMillis(x);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = df.format(c.getTime());
        return str;
    }

	/**
	 * 随机？？岁生日
	 * 
	 * @return
	 */
	public static String getBirthdayDate(Integer min, Integer max) {
		Calendar c = Calendar.getInstance();
		// 月份0--11
		int minb = c.getWeekYear() - min;
		int maxb = c.getWeekYear() - max;
		int month = c.getInstance().get(c.MONTH);// 当前月份
		int day = c.getInstance().get(c.DATE);// 当前天
		c.set(maxb, month, day);
		// 获取1980年1月1日的毫秒数
		long L = c.getTimeInMillis();
		// System.out.println(l);
		// 设置日历时间为当前的日期
		c.set(minb, month, day);
		// 当前时间的毫秒数
		long L2 = c.getTimeInMillis();
		// System.out.println(l2);
		long x = L + (long) (Math.random() * (L2 - L));
		// 用毫秒数设置为当前日历日期
		c.setTimeInMillis(x);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(c.getTime());
		return str;
	}

	/*
	 * public static void main(String[] args) { for (int i = 0; i < 10; i++) {
	 * System.out.println(getBirthdayDate(1, 50)); System.out.println(new
	 * Date().getDate() + " " + (new Date().getMonth() + 1)); } }
	 */
}
