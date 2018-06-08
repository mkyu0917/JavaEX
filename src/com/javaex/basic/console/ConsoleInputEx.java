package com.javaex.basic.console;
import java.util.Scanner;

public class ConsoleInputEx {
	
	public static void main(String[] args){
	 //java.util.Scanner;도 가능	
		
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("너의 이름를 입력해주세요");
	   String name = scan.nextLine();
	   
	   System.out.println("너의 나이를 입력해주세요");
	    int age = scan.nextInt();
	   
	   
	   
	   System.out.println("welcome, " + name);
	   System.out.println("age, " + age);
	   
	   scan.close();//쓰고나면 닫아주자.
	}
}
