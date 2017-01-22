package com.kimkyuwan.bbs;

import java.util.Calendar;

public class Util {
	public static String getDatetime() {
		
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH+1);
		int d = cal.get(Calendar.DATE);
		
		int h = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		String datetime = y + "-" + m + "-" + d + " " + h + ":" + min + ":" + s;
		
		return datetime;
		
	}
	
	public static int getNumber(String value){
		try{
			return Integer.parseInt(value);
		}catch(Exception e){
			return -1;
		}
	}
}
