package com.javaex.basic.operators;

public class BitOperEx {
	
	public static void main(String[] args){
		
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2;
		// -> bit and 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; //-> or연산
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // exclusive or 연산 (XOR)
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not 연산 int 형이라서 4바이트 길게나옴
		System.out.println(Integer.toBinaryString(result));
		
	}
}
