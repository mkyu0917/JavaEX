package com.javaex.loop;

public class BreakEx {

		public static void main(String[] args){
			
			int num = 1;
			
			//true�� �������� �θ� ���ѷ���
			while (true) {
				if(num % 6 == 0 && num % 14 == 0)
					break;
				num++;
				
			}
			System.out.println(num);
			
		}
}
