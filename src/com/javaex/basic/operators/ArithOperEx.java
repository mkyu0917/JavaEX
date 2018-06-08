package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args){
	
		int a = 7;
		int b = 3;
		
		// 부호 연산자 : +, - (산술연산자중 우선순위 젤 높음)
		System.out.println(-a);
		System.out.println(-1*a);
		System.out.println("--------");
		
		// 사칙연산
		a = 7;
		System.out.println(a + b); // 덧셈
	    System.out.println(a - b); // 뺄셈
	    System.out.println(a * b); // 곱셈
	    System.out.println(a / b); // 나눗셈
	    System.out.println(a % b); // 나머지
	    System.out.println("--------");
		
	    // 정수와 정수의 나눗셈은 정수
	    System.out.println((float)a/(float)b);
	    System.out.println((float)a/b);// 암묵적으로 넓은 자료형으로 변경 float > int
	    System.out.println("--------");
	    
	    // 증감연산자 ++, --
	    // ++a 와 a++를 혼동하지말자
	    System.out.println(a);
	    System.out.println(++a);//선증가 후대입 , 더하고 출력
	    System.out.println(a);
	    System.out.println("--------");
	    System.out.println(b);
	    System.out.println(b++);//후증가 선대입 , 출력하고 더함
	    System.out.println(b);
	    System.out.println("--------");
	
	    // 나눗셈 보충
	    //System.out.println(4 / 0); ArithmeticException
	    System.out.println(4.0 / 0); //Infinity
	    
	    System.out.println(7 % 4);
	    System.out.println(7.2 % 2.0); // 유의, 문제있는 연산
	    
	    // Infinite의 체크
	     System.out.println(Double.isInfinite(4.0 / 0)); //wrapperclass = 기본타입(int, char, float ETC..)들을 객체로 포장
	    // NaN
	    System.out.println(Double.isNaN(4.0 / 0));
	    
	}
	
}
