package com.javaex.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i = 1;
		System.out.println("단을 입력하세요");
		int dan = scan.nextInt();
		
		for(i=1;i<=9;i++){
			System.out.println(dan + "X" + i+ "=" + dan * i );
		}
	}
}
