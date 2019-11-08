package com.bwie.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 瀛欐辰榫�
 *
 * 2019骞�11鏈�7鏃�
 */
public class StringUtils {
	/**
	 * 
	* @Title: isBlank  
	* 鍒ゆ柇鏄惁涓虹┖
	* @param @param str
	* @param @return     
	* @return boolean    
	* @throws
	 */
	public static boolean isBlank(String str) {
		return (str==null || str.trim().equals(""));
	}
	/**
	 * 
	* @Title: haveValue  
	* 鍒ゆ柇鏄惁鏈夊��
	* @param @param str
	* @param @return     
	* @return boolean    
	* @throws
	 */
	public static boolean haveValue(String str) {
		return !(str==null || str.trim().equals(""));
	}
	/**
	 * 
	* @Title: isMobile  
	* 鍒ゆ柇鎵嬫満鍙�  
	* @param @param str
	* @param @return     
	* @return boolean    
	* @throws
	 */
	public static boolean isMobile(String str) {
		String regex="^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	/**
	 * 
	* @Title: isEmail  
	* 楠岃瘉閭 
	* @param @param str
	* @param @return     
	* @return boolean    
	* @throws
	 */
	public static boolean isEmail(String str) {
		String regex="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		return m.find();
	}
	/**
     ** 
	 ** @Title: getRandomStr  
	 ** 鑾峰彇n浣嶉殢鏈鸿嫳鏂囧瓧绗︿覆 
	 ** @param @param n
	 ** @param @return     
	 ** @return String    
	 ** @throws
	 **/
	public static String getRandomStr(int n) {
		StringBuilder sb=new StringBuilder();
		
		Random random=new Random();
		
		for (int i = 0; i < n; i++) {
			sb.append((char)('A'+random.nextInt(26)));
		}
		return sb.toString();
	}
	/**
	 * 
	* @Title: getRandomStr2  
	* 鑾峰彇n浣嶉殢鏈鸿嫳鏂囧拰鏁板瓧瀛楃涓�  
	* @param @param n
	* @param @return     
	* @return String    
	* @throws
	 */
	public static String getRandomStr2(int n) {
		StringBuilder sb=new StringBuilder();
		
		Random random=new Random();
		
		for (int i = 0; i < n; i++) {
			int r=random.nextInt(26);
			if (r<26) {
				char c=(char)('A'+r);
				sb.append(c);
			}else {
				sb.append(r-26);
			}
		}
		return sb.toString();
	}
	/**
	 * 
	* @Title: getRandomCn  
	* 鑾峰彇闅忔満涓枃  
	* @param @param n
	* @param @return     
	* @return char    
	* @throws
	 */
	public static char getRandomCn(int n) {
		String str = "";
        int hightPos; 
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("閿欒");
        }

        	return str.charAt(0);

	}
	/**
	 * 
	* @Title: getRandomCnn  
	* 闅忔満鑾峰彇姹夊瓧瀛楃涓�  
	* @param @param n
	* @param @return     
	* @return String    
	* @throws
	 */
	public static String getRandomCnn(int n) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(StringUtils.getRandomCn(n));
		}

        return sb.toString();

	}
	
}
