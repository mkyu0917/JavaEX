package com.javaex.basic.practice1;

public class PracticeTypyCasting {

		public static void main(String[] args){
			
			// 암묵적 형변환 작은범위에서 큰범위로
			int num1 =2;
			float num2 = 3.14f;
			float num3 = num1*num2; //원래 num1은 정수값이지만 형변환에 의해서 더 넓은범위의 실수값 float로 변경되서 계산됨
			System.out.println(num3);
			
			// 명시적 형변환 큰범위에서 작은범위로 갈때는 표시를 해주어야함
			int intValue = 12345;
			byte byteValue = (byte)intValue; 
			System.out.println(byteValue);
			
		}
}
