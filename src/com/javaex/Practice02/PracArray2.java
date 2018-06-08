package com.javaex.Practice02;

public class PracArray2 { // 배열의 복사

	public static void main(String[] args){
		/*
		int[] intArray = {1,2,3};
		int[] newArray = new int[10];
		for(int i=0; i <intArray.length; i++){
			newArray[i] = intArray[i]; 

			
			System.out.print(intArray[i]);
			
			//System.out.print(newArray[i]);
		}
		System.out.println();
		for(int i=0; i< newArray.length;i++){
			System.out.print(newArray[i]+ " ");
			
		}*/
		
		//배열의복사2
		
		int[] Array = {1,2,3};
		int[] newArray = new int[10];
		
		System.arraycopy(Array, 0, newArray, 0, Array.length);
						//원본배열 , 시작인덱스, 붙여넣기할배열, 시작인덱스, 복사할 길이;
		
		for(int i= 0; i<Array.length; i++){
			
			System.out.print(newArray[i]+" ");
		}
		System.out.println();
	
		
	}
}
