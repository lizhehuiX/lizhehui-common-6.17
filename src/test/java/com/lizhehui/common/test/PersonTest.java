package com.lizhehui.common.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.lizhehui.common.bean.Person;
import com.lizhehui.common.utils.RandomUtil;
import com.lizhehui.common.utils.StringUtil;
import com.lizhehui.common.utils.TTest;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:测试类 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
//@ContextConfiguration(locations = "classpath:spring-beans.xml")
//@RunWith(SpringJUnit4ClassRunner.class) 
public class PersonTest {



	/**
	 * <br>
	 * Description:PersonTest测试类 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void GetTestperson() {
		// for (int i = 0; i < 100; i++) {
			Person p = new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120),
					StringUtil.randomChineseStringGBK(140), StringUtil.getDate());
			System.out.println(p);
		// }

	}

	@Test
	private void publi() {
		
		System.out.println(TTest.stringConversionDate("2019-07-31 23:59:59", "yyyy-MM-dd HH:mm:ss"));
	}

	public Date main(String[] args) {
		String time = "2019-07-31 23:59:59";
		String dateType = "yyyy-MM-dd HH:mm:ss";
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
