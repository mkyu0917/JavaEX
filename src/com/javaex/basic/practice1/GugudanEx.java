package com.javaex.basic.practice1;

import java.util.Scanner;

public class GugudanEx {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("단수를 입력해주세요");
		int dan = scan.nextInt();
		int i=1;
		/*for(int i=1; i<10; i++){
			System.out.println(dan + "*" + i + "=" + dan * i);
		}*/
		
		while(i<10){
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++;
		}
	}
}
