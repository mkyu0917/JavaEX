package com.not.java;

public class BitOpUst {
	public static void main(String[] args){
		byte n1 = 13; // 00001101
		byte n2 = 7;  // 00000111
		int n3= n1&n2;// &= ��Ʈ������ �Ѵ� 1�϶� 1 ��갪�� 00000101 =5
		System.out.println(n3);
		
		byte n4 = 10; //00001010
		byte n5 = 12; //00001100
		int  n6= n4|n5;//00001010 =6 |or ��Ʈ������ ���� �ϳ��� 1�̶� 1�� ǥ��
		System.out.println(n6);
		
		byte n7 = 13; //00001101
		byte n8 = 9;  //00001001
		int  n9= n7^n8;//00000100
		System.out.println(n9);
		
		int num=15678;
		System.out.println((num>>2)&1);
		System.out.println((num>>4)&1);
		
	}
}
