package cn.Benson.witmed.util;

import java.util.Properties;

/**
 * 系统校验工具类
 */
public class ValidationUtil {
	private static Properties props = new Properties();

	static {
		try {
			// 加载配置文件 enums.properties
			props.load(ValidationUtil.class.getClassLoader().getResourceAsStream("props/regex.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 手机号码正则表达式
	 */
	private static final String REGEX_CELLPHONE = props.getProperty("regex.cellphone");

	/**
	 * 判断所给的字符串是否符合手机号码格式
	 * @param cellphone
	 * @return
	 */
	public static boolean isCellphone(String cellphone){
		if(StringUtil.isNotEmpty(cellphone) && cellphone.matches(REGEX_CELLPHONE)){
			return true;
		}
		return false;
	}
}
