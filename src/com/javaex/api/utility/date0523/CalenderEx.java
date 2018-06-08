package com.javaex.api.utility.date0523;

import java.util.Calendar;

public class CalenderEx {
	
	public static void main(String[] args) {
		
		// Ķ���� �ҷ�����
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		custom.set(1972, 5, 24); //Ư���ʵ� ����
		// ������ ��: ���� 0���� �����Ѵ�, �� �����  6�� 24���� �ǹ��Ѵ�.
		
		// Ķ�������� ����� �޾ƿ� ���ڽ��ϴ�.
		int year = now.get(Calendar.YEAR); //��
		int month = now.get(Calendar.MONTH);//��
		int date = now.get(Calendar.DATE);//��
		//����� ���ô�.
		
		System.out.printf("������ %d�� %d�� %d�� %n", year, month , date );
		month = now.get(Calendar.MONTH)+1;
		System.out.printf("������ %d�� %d�� %d�� %n", year, month , date );
		
		//10�� �ڷ� �����غ��ô�.
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);//Ư���ʵ尪 ���ϱ� ����
		//System.out.println(future);
		System.out.printf("future: %d�� %d�� %d��%n",
							future.get(Calendar.YEAR),
							future.get(Calendar.MONTH)+1,
							future.get(Calendar.DATE));
		
		//�� ���� ���� �����ϱ�?	
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		String dowStr;
		
		switch(dow) {
		
		case Calendar.SUNDAY:
			dowStr = "�Ͽ���";
			break;
			
		case Calendar.MONDAY:
			dowStr = "������";
			break;
		case Calendar.TUESDAY: //3����
			dowStr = "ȭ����";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "������";
			break;
		case Calendar.THURSDAY:
			dowStr = "�����";
			break;
		case Calendar.FRIDAY:
			dowStr = "�ݿ���";
			break;
		case Calendar.SATURDAY:
			dowStr = "�����";
			break;
		default:
			dowStr ="?";
		}
		System.out.println(dowStr);
		
	}
}
