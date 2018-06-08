package com.javaex.quiz02;

public class Quiz02_1 {
	
	public static void main(String[] args){
	
		int a =3;
		int b =6;
		char c ='A';
		
		boolean result1, result2, r1;
		
		result1 = (3 % 2) == 0;
		System.out.println("a의 값은 짝수입니까? " + result1);
		
		result2 = (6 % 3) == 0;
		System.out.println("b는 3의 배수입니까 ? " + result2);
		
		r1 = (3 % 2) == 0 && (6 % 3) == 0 ;
		System.out.println("결과값은? " + r1);
		
		char r2 = (char)(c + 4);
		
		System.out.println(r2);
		
	}
}
