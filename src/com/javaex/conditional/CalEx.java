package com.javaex.conditional;

import java.util.Calendar;
import java.util.Scanner;

public class CalEx {
	public static void main(String[] args){
		System.out.println("해당하는 달을 입력해주세요.");
		//Calendar cal = Calendar.getInstance();
		Scanner month = new Scanner(System.in);
		//int maxDay = cal.getActualMaximum(Calendar.DATE);
		
		int lastDay = month.nextInt();
		
		
		/*switch(lastDay) {
		case 1:
		case 12: System.out.println("마지막 날짜는"+ maxDay + "입니다.");
		    break;
		default : System.out.println("잘못입력했다.");
			break;
		 */
		
		switch(lastDay){
		case 2: 
			System.out.println("28일");
			break;
		case 1:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10: 
			System.out.println("30일");
			break;
		case 11:
		case 12:
			System.out.println("30일");
			break;
		default :
			System.out.println("잘못입력햇음");
			break;
		}
	}
}
