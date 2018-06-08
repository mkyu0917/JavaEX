package com.javaex.basic.practice1;

import java.util.Scanner;

public class IfElseEx {
 
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		
		int input = scan.nextInt();
			if(input>0){
				System.out.println("양수입니다.");
			}else if(input<0){
				System.out.println("음수입니다.");
				
			}else{
				System.out.println("0입니다.");
			}
	}
}
