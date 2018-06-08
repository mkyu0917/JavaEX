package com.javaex.loop;

public class BreakEx {

		public static void main(String[] args){
			
			int num = 1;
			
			//true를 조건으로 두면 무한루프
			while (true) {
				if(num % 6 == 0 && num % 14 == 0)
					break;
				num++;
				
			}
			System.out.println(num);
			
		}
}
