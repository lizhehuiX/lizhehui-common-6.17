package com.lizhehui.common.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.lizhehui.common.bean.Person;
import com.lizhehui.common.utils.RandomUtil;
import com.lizhehui.common.utils.StringUtil;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:测试类 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
public class PersonTest {

	/**
	 * <br>
	 * Description:PersonTest测试类 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void GetTestperson() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 100; i++) {
			Person p = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120),
					StringUtil.randomChineseString(140), s.format(new Date()));
			System.out.println(p);
		}

	}
}
