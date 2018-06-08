package com.javaex.basic.operators;

public class BitShiftEx {

	public static void main(String[] args){
		// 비트 쉬프트
		
		int val =1 ;
		//Integer.toBinaryString 
		//정수의 내부표현 확인 Int타입의 내부표현을 문자열로 만들어서 리턴하는메소드
		
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 1));
		System.out.println(Integer.toBinaryString(val << 4));
		
		System.out.println("==========");
		
		// 우측비트시프트
		int val2 = 0b1000;
		
		System.out.println(Integer.toBinaryString(val2 >> 1));
		System.out.println(Integer.toBinaryString(val2 >> 3));
	}
}
