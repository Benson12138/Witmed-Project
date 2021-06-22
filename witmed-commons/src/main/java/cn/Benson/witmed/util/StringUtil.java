package cn.Benson.witmed.util;

/**
 * 字符串操作工具类
 */
public class StringUtil {
	/**
	 * 判断给定的字符串不是空字符串
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(str!=null && !"".equals(str.trim())){
			return true;
		}
		return false;
	}
}
