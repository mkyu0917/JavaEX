package com.javaex.Practice02;

public class PracArray {

	public static void main(String[] args){
		
		//배열을 선언하는 두가지방법
		
		//1.타입[]변수;
	//	int[] intArray;
		
		//2.타입 변수[];
	//	String StrArray[];
	
		
		/*
		char[] c = new char[3];
		
		c[0] = 'b';
		c[1] = 'c';
		c[2] = 'd';
		
		System.out.println(c[2]);
		*/
		
		//배열의 초기화
		//1.값의 목록을 {}으로 지정하여 초기화
		String[] Array ={ "가", "나", "다", "라", "마", "바", "사", "아"};
		System.out.println(Array[1] + Array[3]);
		
		//2. 배열선언후 new 타입[]{}으로도 선언가능
		String[] Array2;
		
		Array2 = new String[]{ "꼬끼오","꼬꼬꼬","꼭끼옹",};
		System.out.println(Array2[1]);
		
		//3. new연산자로 배열 생성
			int[] intArray = new int[3]; //new int[3] 3은 배열의 크기 배열의 크기는 배열-1
			intArray[0] = 3;
			intArray[1] = 4;
			intArray[2] = 5;
		   /*
			for(int i=0; i<3; i++){ // 배열의 갯수 for문으로 세기
				System.out.println(intArray[i]);
			}
			for(int i=0; i<intArray.length; i++){//배열의 갯수 length로 구하기
				System.out.println(intArray[i]);
			}
			*/
			
			int result =0;
			for(int i=0; i<intArray.length; i++){ // 배열의 갯수 for문으로 세기
			 result =+i;	
			}
			System.out.println(intArray[3]);// <-- 배열은 0부터 시작함
			
		}
	}

