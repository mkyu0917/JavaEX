package com.javaex.api.utility.date0523;

import java.text.DateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date now = new Date();
			String nowStr = now.toString();
			
			System.out.println(nowStr);
			System.out.println(now.toLocaleString()); //deprecated(폐지예정)
			
			// 형식에 맞게 출력
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
			System.out.println(df.format(now));
			df = DateFormat.getDateInstance(DateFormat.LONG);
			System.out.println(df.format(now));
			df = DateFormat.getDateInstance(DateFormat.MEDIUM);
			System.out.println(df.format(now));
			df = DateFormat.getDateInstance(DateFormat.SHORT);
			System.out.println(df.format(now));
	}

}
