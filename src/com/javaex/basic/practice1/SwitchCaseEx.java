package com.javaex.basic.practice1;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		switch(input){
		case 1:
			System.out.println("1번을 선택하셨습니다.");
			break;
		case 2:
			System.out.println("2번을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("3번을 선택하셨습니다.");
			break;
		case 4:
			System.out.println("4번을 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못선택하셨습니다.");
			
		}
		
	}
	
}
