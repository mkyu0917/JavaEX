package com.javaex.conditional;

import java.util.Calendar;
import java.util.Scanner;

public class CalEx {
	public static void main(String[] args){
		System.out.println("�ش��ϴ� ���� �Է����ּ���.");
		//Calendar cal = Calendar.getInstance();
		Scanner month = new Scanner(System.in);
		//int maxDay = cal.getActualMaximum(Calendar.DATE);
		
		int lastDay = month.nextInt();
		
		
		/*switch(lastDay) {
		case 1:
		case 12: System.out.println("������ ��¥��"+ maxDay + "�Դϴ�.");
		    break;
		default : System.out.println("�߸��Է��ߴ�.");
			break;
		 */
		
		switch(lastDay){
		case 2: 
			System.out.println("28��");
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
			System.out.println("30��");
			break;
		case 11:
		case 12:
			System.out.println("30��");
			break;
		default :
			System.out.println("�߸��Է�����");
			break;
		}
	}
}
