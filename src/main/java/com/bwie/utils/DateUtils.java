package com.bwie.utils;

import java.util.Date;

/**
 * @author 孙泽龙
 *
 * 2019年11月7日
 */
public class DateUtils {
	public int compare(Date date1,Date date2) {
		if (date1==null || date2==null) {
			throw new RuntimeException("参数不能为空");
		}
		return date1.compareTo(date2);
	}
}
