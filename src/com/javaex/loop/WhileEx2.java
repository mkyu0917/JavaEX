package com.javaex.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		int i = 1;
		
		while(i<=9){
			System.out.println(dan + "X" + i + "=" + dan * i);
			i++; // 인덱스 변수 주의 , 무한루프 돌수있음
		}
		
		scanner.close();
	}
}
