package com.javaex.basic.practice1;

public class PracticeTypyCasting {

		public static void main(String[] args){
			
			// �Ϲ��� ����ȯ ������������ ū������
			int num1 =2;
			float num2 = 3.14f;
			float num3 = num1*num2; //���� num1�� ������������ ����ȯ�� ���ؼ� �� ���������� �Ǽ��� float�� ����Ǽ� ����
			System.out.println(num3);
			
			// ����� ����ȯ ū�������� ���������� ������ ǥ�ø� ���־����
			int intValue = 12345;
			byte byteValue = (byte)intValue; 
			System.out.println(byteValue);
			
		}
}
