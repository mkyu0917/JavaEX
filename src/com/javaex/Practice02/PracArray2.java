package com.javaex.Practice02;

public class PracArray2 { // �迭�� ����

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
		
		//�迭�Ǻ���2
		
		int[] Array = {1,2,3};
		int[] newArray = new int[10];
		
		System.arraycopy(Array, 0, newArray, 0, Array.length);
						//�����迭 , �����ε���, �ٿ��ֱ��ҹ迭, �����ε���, ������ ����;
		
		for(int i= 0; i<Array.length; i++){
			
			System.out.print(newArray[i]+" ");
		}
		System.out.println();
	
		
	}
}
