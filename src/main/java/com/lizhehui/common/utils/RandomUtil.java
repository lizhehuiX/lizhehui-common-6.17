package com.lizhehui.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:RandomUtil工具 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
public class RandomUtil {

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	// 方法1：返回min-max之间的随机整数（包含min和max值），
	// 例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。
	public static Integer random(int min, int max) {
		Random r = new Random();
		int sum = min + r.nextInt(max - min + 1);
		return sum;
	}

	// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
	// 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	// 应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	public static Set<Integer> subRandom(int min, int max, int subs) {
		Set<Integer> set1 = new HashSet<Integer>();
		// for(int i=0;i<subs;i++) {
		while (set1.size() != subs) {
		Random r = new Random();
		int sum = min + r.nextInt(max - min + 1);
			set1.add(sum);
		}
		return set1;

	}

	// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		String str = "123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
		Integer integer = random(0, str.length() - 1);
		char c = str.charAt(integer);
		return c;
	}

	// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {
		String ss = "";
		 for(int i=0;i<length;i++) {
			ss += randomCharacter();
		}
		
		return ss;

	}
}
