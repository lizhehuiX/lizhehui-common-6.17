package com.lizhehui.common.test;

import org.junit.Test;

import com.lizhehui.common.utils.RandomUtil;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:测试 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
public class RandomTest {

	/**
	 * <br>
	 * Description:获取随机数 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void random() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.random(1, 6));
		}
	}

	/**
	 * <br>
	 * Description:获取N个不重复的随机数 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void subRandom() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.subRandom(1, 10, 9));
		}
	}

	/**
	 * <br>
	 * Description:返回1个1-9,a-Z之间的随机字符<br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void randomCharacter() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomCharacter());
		}
	}

	/**
	 * <br>
	 * Description:返回长度为N的随机字符串<br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void randomString() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomString(4));
		}
	}

	/*
	 * @Test public void aa() {
	 * 
	 * String str = "123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
	 * System.out.println(str.length());
	 * 
	 * SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * System.out.println(new Date() + s.format(new Date())); }
	 */

}
