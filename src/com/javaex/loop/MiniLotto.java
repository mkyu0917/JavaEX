package com.javaex.loop;

public class MiniLotto {

		public static void main(String[] args){
			for(int i=0; i <6; i++){
				
				System.out.print((int)(Math.random()*45)+1);
				System.out.print(" ");
			}
			System.out.println();
		
		// while�� ����
		int index = 0;
		
		while(index < 6) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.print(" ");
			index++; // ����Ż���� ���ؼ� �����ؾߵ� 
		}
		System.out.println();
}
}