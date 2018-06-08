package com.javaex.basic.practice1;
import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int value = scanner.nextInt();
		System.out.println("너의 지능은 " + value + " 입니다.");
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println("너의 이름은 " + name + "입니다.");
		scanner.close();
		
	}
}
