package com.javaex.basic.practice1;

public class ArithEx {

	public static void main(String[] args){
		
		 //선증가 후대입 
		 int a = 1;
		 System.out.println(a);
		 System.out.println(++a);
		 System.out.println(a);
		 System.out.println("-------");
			 
		 //선대입 후증가
		 int b = 1;
		 System.out.println(b);
		 System.out.println(b++);
		 System.out.println(b);
		 System.out.println("-------");
	
		 //대입연산자 <--방향으로 대입 
		 int val1=7, val2=3;
		 
		 //산술연산자
		 
		 System.out.println(val1 / val2);//나눗셈 몫
		 System.out.println(val1 % val2);//나눗셈 나머지
		 System.out.println(val1 * val2);//곱하기
		 System.out.println("-------");
		 
		 
	}
}
