package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		// Wrapper기본: 만들기
		
		Integer i = new Integer (10);
		Character c = new Character('c');
		// jdk9 에서 new Wrapper는 deprecated
		
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		// 문자열로 넣어도 됩니다.
		Integer i1 = Integer.valueOf("10"); // 문자열을 integer로 박싱한다.
		Double d1 = Double.valueOf("3.14159");
		Boolean b1 = Boolean.valueOf("false");
		// 대신 문자열의 형태가 해당 기본형의 형태를 갖춰야한다.
		
		// 자동박싱(Autu Boxing)
		Integer i2 = 10; // == Integer i2 = Integer.valuof(10); <--- 이 과정이 생략됨
		
		//parse계열 메서드 : 문자열을 이용, 해당 타입으로 변환, 또는 다른 타입으로 변환
		System.out.println(Integer.parseInt("-123")); // 문자열-> 정수
		System.out.println(Integer.parseInt("10",16));// 16진수 문자열-> 정수
		System.out.println(Integer.toBinaryString(28));//이진수 문자열로 변환		
		System.out.println(Integer.toHexString(28));  // 16진수 문자열로
		//형변환
		
		System.out.println(i2.doubleValue()); //Integer로 변환했던 i2를 double로 변환
		System.out.println(i2.floatValue());  //i2를 float로 변환
		
		// 포장된 값의 비교
		Integer i3 = Integer.valueOf(2018); 
		Integer i4 = Integer.valueOf(2018);
		System.out.println(i3==i4);
		//두개다 객체화 되어서 저장된 주소값이 달라서 false로 나옴
		
		//언박싱비교
		System.out.println(i3.intValue()==i4.intValue());
		
		//언박싱 비교2
		System.out.println(i3.equals(i4)); // 값이 같은지 비교 , 기본형 타입은 같은 주소값을 사용
	}

}
