package com.javaex.basic.practice1;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int value = scanner.nextInt();
		System.out.println("���� ������ " + value + " �Դϴ�.");
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = scanner.next();
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		scanner.close();
		
	}
}
