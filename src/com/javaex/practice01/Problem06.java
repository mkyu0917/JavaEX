package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {
  public static void main(String[] args){
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("���ڸ� �Է��ϼ���:");
	  int num = scanner.nextInt();
	  
	  int startNum = (num % 2 == 0) ? 2:1;
	 
	  int sum = 0;
	  
	  for(int i = startNum; i<=num ; i+=2){
		  sum += i;
	  }
	  System.out.println("���: " + sum);
	  scanner.close();
  }
}
