package com.javaex.quiz02;

public class Quiz02_1 {
	
	public static void main(String[] args){
	
		int a =3;
		int b =6;
		char c ='A';
		
		boolean result1, result2, r1;
		
		result1 = (3 % 2) == 0;
		System.out.println("a�� ���� ¦���Դϱ�? " + result1);
		
		result2 = (6 % 3) == 0;
		System.out.println("b�� 3�� ����Դϱ� ? " + result2);
		
		r1 = (3 % 2) == 0 && (6 % 3) == 0 ;
		System.out.println("�������? " + r1);
		
		char r2 = (char)(c + 4);
		
		System.out.println(r2);
		
	}
}
