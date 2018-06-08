package com.not.java;

import java.util.Scanner;

public class Factorial {
	
	 public static void main(String[] args){
		 	
		 	Scanner scan = new Scanner(System.in);
		 	
		 	int num = scan.nextInt();
		 	int f=1;
		 	for(int i=1; i<=num; i++){
		 		  
		 		f*=i;
		 		   
		 		  if(i==num){
		 			 
		 			System.out.println(f);
		 		 }
		 		
		 	}
		 	
		 	
	 }
}
