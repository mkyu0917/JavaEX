package com.javaex.basic.console;
import java.util.Scanner;

public class ConsoleInputEx {
	
	public static void main(String[] args){
	 //java.util.Scanner;�� ����	
		
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("���� �̸��� �Է����ּ���");
	   String name = scan.nextLine();
	   
	   System.out.println("���� ���̸� �Է����ּ���");
	    int age = scan.nextInt();
	   
	   
	   
	   System.out.println("welcome, " + name);
	   System.out.println("age, " + age);
	   
	   scan.close();//������ �ݾ�����.
	}
}
