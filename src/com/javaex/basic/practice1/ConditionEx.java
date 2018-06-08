package com.javaex.basic.practice1;
import java.util.Scanner;
public class ConditionEx {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요: ");
		int exam = scanner.nextInt();
		
		if(exam >=60){
			System.out.println("합격입니다.");
		}
		else{
			System.out.println("지옥에나 떨어져라");
		}
		
	}
}
