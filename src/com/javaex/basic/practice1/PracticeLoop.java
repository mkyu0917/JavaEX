package com.javaex.basic.practice1;

public class PracticeLoop {

	public static void main(String[] args){
		int dan ;
		int i = 1;
		
		for(i=2; i<10; i++){ // 1부터 9까지 반복 1번
			for(int j=1; j<10; j++){ // 2번
				System.out.print(i);
				System.out.print("\t");
			}					
		 System.out.println(); //3번	
		}
	}
}
