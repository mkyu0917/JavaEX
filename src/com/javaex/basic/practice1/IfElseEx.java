package com.javaex.basic.practice1;

import java.util.Scanner;

public class IfElseEx {
 
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���: ");
		
		int input = scan.nextInt();
			if(input>0){
				System.out.println("����Դϴ�.");
			}else if(input<0){
				System.out.println("�����Դϴ�.");
				
			}else{
				System.out.println("0�Դϴ�.");
			}
	}
}
