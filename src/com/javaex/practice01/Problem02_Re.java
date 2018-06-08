package com.javaex.practice01;

import java.util.Scanner;

public class Problem02_Re {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i=1; i<=input;i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);	
			}
			System.out.println();
		}
	}
}
