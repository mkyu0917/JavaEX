package com.javaex.reftype;

public class ArrayCopyFor {
	
		public static void main(String[] args){
			// 배열은 크기변경이 안된까	
			// 새 배열로 복사아
			
			int source[] = {1, 2, 3};
			int target[] = new int[10];
			
			
			// 복사
			for(int i = 0; i <source.length; i++){
				target[i] = source[i];
			}
			
			for(int i =0; i < target.length; i++){
				System.out.print(target[i]+" ");
				
			}
			System.out.println();
		}
}
