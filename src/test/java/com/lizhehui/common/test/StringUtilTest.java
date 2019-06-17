package com.lizhehui.common.test;

import org.junit.Test;

import com.lizhehui.common.utils.StringUtil;

/**
 * <br>
 * Title:TODO 类标题 <br>
 * Description:TODO 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月17日
 */
public class StringUtilTest {

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHasLength() {
		System.out.println("是否有值" + StringUtil.hasLength(""));
	}

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testHasText() {
		System.out.println("是否有值" + StringUtil.hasText("  "));
	}

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testRandomChineseString() {

		System.out.println(StringUtil.randomChineseString(10));
	}

	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 */
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
		System.out.println(StringUtil.generateChineseName());
		}
	}

}
