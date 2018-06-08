package com.javaex.basic.practice1;

import java.util.Scanner;

public class ConditionalOper_Practice {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수를 입력하세요");
		int score = scan.nextInt();
		
		
		if(score>=60){
			System.out.println("합격입니다.");
		}else{
			System.out.println("불합격입니다.");
		}
	}
}
