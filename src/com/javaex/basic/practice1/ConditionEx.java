package com.javaex.basic.practice1;
import java.util.Scanner;
public class ConditionEx {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ���: ");
		int exam = scanner.nextInt();
		
		if(exam >=60){
			System.out.println("�հ��Դϴ�.");
		}
		else{
			System.out.println("�������� ��������");
		}
		
	}
}
