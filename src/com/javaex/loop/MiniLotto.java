package com.javaex.loop;

public class MiniLotto {

		public static void main(String[] args){
			for(int i=0; i <6; i++){
				
				System.out.print((int)(Math.random()*45)+1);
				System.out.print(" ");
			}
			System.out.println();
		
		// while문 버전
		int index = 0;
		
		while(index < 6) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.print(" ");
			index++; // 루프탈출을 위해서 조심해야됨 
		}
		System.out.println();
}
}