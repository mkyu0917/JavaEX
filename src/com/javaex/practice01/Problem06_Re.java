package com.javaex.practice01;

import java.util.Scanner;

public class Problem06_Re {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int sum=0;
		for(int i=1; i<=input;i++){
				
				if(i%2!=0){
					 sum+=i;
					 
				}
		}
		System.out.print(sum);
		}
		}
