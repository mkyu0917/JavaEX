package com.javaex.basic.practice1;

import java.util.Scanner;

public class PracticeTripleOper {
	
	public static void main(String[] args){
		
		/*int i=4, j=6, total=0;
		boolean result;
		
		result=i+j ==10 ? true: false;
		System.out.println(result);
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력해주세요");
		int input = scan.nextInt();
	    
		System.out.println("당신의 나이는" + input + "이며" + "이름은"+ name + "입니다.");
		
		/*boolean total;
		
		total = input%2==0 ? true:false;
		System.out.print(total);
		*/
	}
	
}
