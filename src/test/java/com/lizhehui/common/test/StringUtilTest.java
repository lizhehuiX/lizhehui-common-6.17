package com.lizhehui.common.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.lizhehui.common.utils.StringUtil;

/**
 * <br>
 * Title:TODO测试类 <br>
 * Description:TODO 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
//@ContextConfiguration(locations = "classpath:spring-beans.xml")
//@RunWith(SpringJUnit4ClassRunner.class) 
public class StringUtilTest {

	/**
	 * <br>
	 * Description:TODO 判断是否有值 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHasLength() {
		System.out.println("是否有值" + StringUtil.hasLength(""));
	}

	/**
	 * <br>
	 * Description:TODO 判断是否有值 -排除空格 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHasText() {
		System.out.println("是否有值" + StringUtil.hasText(" "));
	}

	/**
	 * <br>
	 * Description:随即中文方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testRandomChineseString() {// 全部汉字的
		System.out.println(StringUtil.randomChineseString(10));
	}

	@Test
	public void testRandomChineseStringGBK() {// GBK范围
		System.out.println(StringUtil.randomChineseStringGBK(10));
	}

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 5; i++) {
		System.out.println(StringUtil.generateChineseName());
		}
	}

	/**
	 * <br>
	 * Description:测试字符转换 空格变- 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月28日
	 */
	@Test
	public void testToUniqueTerm() {
		String term = StringUtil.toUniqueTerm("Spring Mvc");
		System.out.println(term);
	}

	/**
	 * <br>
	 * Description:获取指定日期到如今的随机时间 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年7月1日
	 */
	@Test
	public void testGetDateSection() {
			Date date = StringUtil.getDateSection("2000-01-05");
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(s.format(date));
	}

}
