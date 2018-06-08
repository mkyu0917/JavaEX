package com.javaex.basic.operators;

public class BitOperEx {
	
	public static void main(String[] args){
		
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2;
		// -> bit and ����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; //-> or����
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // exclusive or ���� (XOR)
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not ���� int ���̶� 4����Ʈ ��Գ���
		System.out.println(Integer.toBinaryString(result));
		
	}
}
