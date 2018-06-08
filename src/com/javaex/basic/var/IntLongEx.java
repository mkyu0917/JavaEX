package com.javaex.basic.var;

public class IntLongEx {

		public static void main(String[] args){
			
			// int ������ ����
			int intVar1;
			int intVar2;
			
			intVar1 = 2018;
//			intVar2 = 1234567890123; // out of range
			
			System.out.println(intVar1);
			
			// long ������ ����
			long longVar1;
			long longVar2;
			
			longVar1 = 2018;
			longVar2 = 1234567890123L; // long�� �������� �˸��� L�� ���ڿ� ��ߵ�
			
			System.out.println(longVar1);
			System.out.println(longVar2);
			
			// 2����, 8����, 16����
			int bin;
			int oct;
			int hex;
			
			bin = 0b1100; // 2���� 0b
			oct = 072;  // 8���� 0
			hex = 0xff; // 16���� 0x
			
			System.out.println(bin);
			System.out.println(oct);
			System.out.println(hex);
		}
}
