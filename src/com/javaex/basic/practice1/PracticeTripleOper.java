package com.javaex.basic.practice1;

import java.util.Scanner;

public class PracticeTripleOper {
	
	public static void main(String[] args){
		
		/*int i=4, j=6, total=0;
		boolean result;
		
		result=i+j ==10 ? true: false;
		System.out.println(result);
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.nextLine();
		
		System.out.println("���̸� �Է����ּ���");
		int input = scan.nextInt();
	    
		System.out.println("����� ���̴�" + input + "�̸�" + "�̸���"+ name + "�Դϴ�.");
		
		/*boolean total;
		
		total = input%2==0 ? true:false;
		System.out.print(total);
		*/
	}
	
}
