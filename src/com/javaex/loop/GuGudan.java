package com.javaex.loop;

public class GuGudan {
	
		public static void main(String[] args){
			// for�϶� �ε����� i ��ø for���϶� j �Ѵܰ� �� ��ø�϶� k
			// �ܼ�������
			
			for(int dan=2; dan<=9; dan++){
				for(int num=1; num<=9; num++){
					System.out.println(dan + "*" + num + "=" 
									+ dan * num);
				}
			}
		}
}
