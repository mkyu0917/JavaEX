package com.javaex.basic.practice1;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		switch(input){
		case 1:
			System.out.println("1���� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("2���� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("3���� �����ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("4���� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�.");
			
		}
		
	}
	
}
