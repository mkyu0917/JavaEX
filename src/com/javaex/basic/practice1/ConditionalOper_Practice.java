package com.javaex.basic.practice1;

import java.util.Scanner;

public class ConditionalOper_Practice {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ������ �Է��ϼ���");
		int score = scan.nextInt();
		
		
		if(score>=60){
			System.out.println("�հ��Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
	}
}
