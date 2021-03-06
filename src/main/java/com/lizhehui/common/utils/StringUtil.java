package com.lizhehui.common.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class StringUtil {
	static String sname[] = { "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "楮", "卫", "蒋", "沈", "韩", "杨", "朱", "秦",
			"尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦",
			"章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳",
			"酆", "鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐",
			"于", "时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧", "尹", "姚", "邵",
			"湛", "汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒",
			"屈", "项", "祝", "董", "梁", "杜", "阮", "蓝", "闽", "席", "季", "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭",
			"梅", "盛", "林", "刁", "锺", "徐", "丘", "骆", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍", "虞", "万", "支", "柯", "昝",
			"管", "卢", "莫", "经", "房", "裘", "缪", "干", "解", "应", "宗", "丁", "宣", "贲", "邓", "郁", "单", "杭", "洪", "包", "诸",
			"左", "石", "崔", "吉", "钮", "龚", "程", "嵇", "邢", "滑", "裴", "陆", "荣", "翁", "荀", "羊", "於", "惠", "甄", "麹", "家",
			"封", "芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段", "富", "巫", "乌", "焦", "巴", "弓", "牧", "隗", "山", "谷",
			"车", "侯", "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宫", "宁", "仇", "栾", "暴", "甘", "斜", "厉", "戎", "祖",
			"武", "符", "刘", "景", "詹", "束", "龙", "叶", "幸", "司", "韶", "郜", "黎", "蓟", "薄", "印", "宿", "白", "怀", "蒲", "邰",
			"从", "鄂", "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池", "乔", "阴", "郁", "胥", "能", "苍", "双", "闻", "莘", "党",
			"翟", "谭", "贡", "劳", "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦", "雍", "郤", "璩", "桑", "桂", "濮", "牛", "寿", "通",
			"边", "扈", "燕", "冀", "郏", "浦", "尚", "农", "温", "别", "庄", "晏", "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦",
			"艾", "鱼", "容", "向", "古", "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘", "匡", "国",
			"文", "寇", "广", "禄", "阙", "东", "欧", "殳", "沃", "利", "蔚", "越", "夔", "隆", "师", "巩", "厍", "聂", "晁", "勾", "敖",
			"融", "冷", "訾", "辛", "阚", "那", "简", "饶", "空", "曾", "毋", "沙", "乜", "养", "鞠", "须", "丰", "巢", "关", "蒯", "相",
			"查", "后", "荆", "红", "游", "竺", "权", "逑", "盖", "益", "桓", "公", "晋", "楚", "阎", "法", "汝", "鄢", "涂", "钦", "岳",
			"帅", "缑", "亢", "况", "后", "有", "琴", "商", "牟", "佘", "佴", "伯", "赏", "墨", "哈", "谯", "笪", "年", "爱", "阳", "佟",
			"万俟", "司马", "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "赫连", "皇甫", "尉迟", "公羊", "澹台", "公冶", "宗政", "濮阳", "淳于", "单于",
			"太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐", "锺离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空", "丌官", "司寇", "仉", "督",
			"子车", "颛孙", "端木", "巫马", "公西", "漆雕", "乐正", "壤驷", "公良", "拓拔", "夹谷", "宰父", "谷梁", "段干", "百里", "东郭", "南门", "呼延",
			"归", "海", "羊舌", "微生", "梁丘", "左丘", "东门", "西门", "南宫" + "拓拔", "夹谷", "宰父", "谷梁", "段干", "百里", "东郭", "南门", "呼延",
			"归", "海", "羊舌", "微生", "梁丘", "左丘", "东门", "西门", "南宫" };
	// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	/**
	 * <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @param src
	 * @return
	 */
	public static boolean hasLength(String src) {

		if (src != null && src != "" && src.length() != 0) {
			return true;
		} else {
			return false;
		}
	}

	// 方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	/**
	 * <br>
	 * Description:判断源字符串是否有值 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @param src
	 * @return
	 */
	public static boolean hasText(String src) {
		src = src.trim();
		if (src.length() != 0 && src != null && src != "") {
			return true;
		} else {
			return false;
		}

	}

	// 方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	/**
	 * <br>
	 * Description:返回参数length个中文汉字字符串方法功能描述（非简体中文） <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @param length
	 * @return
	 */
	public static String randomChineseString(int length) {
		String ss = "";
		for (int i = 0; i < length; i++) {
		char c = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
			ss += c;
		}
		return ss;
		// TODO 实现代码
	}

	// 方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	/**
	 * <br>
	 * Description:生成名字方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月17日
	 * 
	 * @return
	 */
	public static String generateChineseName() {
		// TODO 实现代码
		Random r = new Random();
		String name = "";
		String c = sname[r.nextInt(sname.length - 1)];
		name += c + randomChineseStringGBK(RandomUtil.random(1, 2));
		return name;
	}

	/**
	 * <br>
	 * Description:获取1980年到当前日期方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月28日
	 * 
	 * @return
	 */
	public static String getDate() {
		Calendar c = Calendar.getInstance();
		// 月份0--11
		c.set(1980, 0, 1);
		// 获取1980年1月1日的毫秒数
		long L = c.getTimeInMillis();
		// System.out.println(l);
		// 设置日历时间为当前的日期
		c.setTime(new Date());
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
	 * <br>
	 * Description:生成简体中文方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月21日
	 * @param length
	 * @return
	 * @throws InterruptedException
	 * @throws UnsupportedEncodingException
	 */
	public static String randomChineseStringGBK(int length) {
		String ss = "";
		int regionCode, positionCode;// regionCode存储区码，positionCode存储位码
		int regionCode_Machine, positionCode_Machine;// regionCode_Machine,positionCode_Machine存储器吗和位码转换为机内码
		Random r = new Random();
		// 范围 常用汉字区码 16-55 位码范围1-94 55区的90，91，92，93，94为空
		for (int i = 0; i < length; i++) {
			// 获取机码和位码
			regionCode = r.nextInt(55 - 16) + 16;
			// 获取位码( 位码范围1-94 55区的90，91，92，93，94为空,将其排出)
			if (regionCode == 55) {
				positionCode = r.nextInt(90);
			} else {
				positionCode = r.nextInt(94);
			}
			//转为机内码
			regionCode_Machine = regionCode + 160;// 160为十六进制的20H+80H=A0H
			positionCode_Machine = positionCode + 160;
			//转换为汉字
			byte[] bytes = new byte[] { (byte) regionCode_Machine, (byte) positionCode_Machine };
			try {
				ss += new String(bytes, "GBK");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ss;
	}


	/**
	 * <br>
	 * Description:统一小写 空格变为- 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月28日
	 * @param str
	 * @return
	 */
	public static String toUniqueTerm(String str) {
		return str.toLowerCase().replaceAll(" ", "-");
	}

	/**
	 * <br>
	 * Description:随机获取一个指定日期到现在日期的 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月28日
	 * 
	 * @param date
	 * @return
	 */
	public static Date getDateSection(String date) {
		String[] s = date.split("-");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-SS");
		/*
		 * for (String string : s) { System.out.println(string); }
		 */
		Calendar c = Calendar.getInstance();
		long d1 = c.getTimeInMillis();
		c.set(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
		long d2 = c.getTimeInMillis();
		long x = d2 + (long) (Math.random() * (d1 - d2));
		c.setTimeInMillis(x);
		//设置日期
		return c.getTime();

	}

	/**
	 * 方法3：判断是否为手机号码 -是返回true 不是返回false <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年7月1日
	 * 
	 * @param src
	 * @return
	 */
	public static boolean isMobile(String src) {
		String mobile = "^(1[74358])\\d{9}$";
		if (src.matches(mobile)) {
			return true;
		} else {
			return false;
		}
		// 实现代码
	}

	/**
	 * 
	 * <br>
	 * Description:TODO 判断是否为邮箱功能描述 <br>
	 * 是返回true 不是返回false<br/>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年6月13日
	 * 
	 * @param src
	 * @return
	 */
	public static boolean isEmail(String src) {
		String email = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

		if (src.matches(email)) {
			return true;
		}
		return false;

	}

	/**
	 * 方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分) <br>
	 * Description:TODO 方法功能描述 <br>
	 * Author:李哲辉(1989773396@qq.com) <br>
	 * Date:2019年7月1日
	 * 
	 * @param src
	 * @return
	 */
	public static String reverse(String src) {
		String src1 = "";
		for (int i = src.length() - 1; i >= 0; i--) {
			char ch = src.charAt(i);
			src1 += ch;
		}
		return src1;
	}
}
