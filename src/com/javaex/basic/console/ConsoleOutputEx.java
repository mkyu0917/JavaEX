package com.javaex.basic.console;

public class ConsoleOutputEx {
	
	public static void main(String[] args){
		// System.out.print		:���� ����
		// System.out.println	:���� ��
		// System.out.printf	:������ ���س��� ���� �޴� ��

		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		//String�� +�� ������ �� �ִ�, String + �⺻����ϸ� ���ڿ��� ����, ��ü�� ���� ���ڿ��� ��°���
		System.out.println(str1 +" "+ str2);
		
		// �̽������� ����
		System.out.println("Hello\nJava"); // ��������
		System.out.println("Hello\tJava"); // �ǹ���
		System.out.println("Hello, \"Java\"");
		System.out.println("\\ ��������");
		
		String dir = "D:\\javastudy\\eclipse";
	}
}
