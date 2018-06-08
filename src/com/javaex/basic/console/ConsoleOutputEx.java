package com.javaex.basic.console;

public class ConsoleOutputEx {
	
	public static void main(String[] args){
		// System.out.print		:개행 안함
		// System.out.println	:개행 함
		// System.out.printf	:서식을 정해놓고 값을 받는 것

		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		//String은 +로 연결할 수 있다, String + 기본기능하면 문자열로 연결, 객체가 가진 문자열도 출력가능
		System.out.println(str1 +" "+ str2);
		
		// 이스케이프 문자
		System.out.println("Hello\nJava"); // 강제개행
		System.out.println("Hello\tJava"); // 탭문자
		System.out.println("Hello, \"Java\"");
		System.out.println("\\ 역슬레시");
		
		String dir = "D:\\javastudy\\eclipse";
	}
}
