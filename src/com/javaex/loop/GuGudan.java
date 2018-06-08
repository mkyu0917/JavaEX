package com.javaex.loop;

public class GuGudan {
	
		public static void main(String[] args){
			// for일때 인덱스는 i 중첩 for문일때 j 한단계 더 중첩일때 k
			// 단수돌리기
			
			for(int dan=2; dan<=9; dan++){
				for(int num=1; num<=9; num++){
					System.out.println(dan + "*" + num + "=" 
									+ dan * num);
				}
			}
		}
}
