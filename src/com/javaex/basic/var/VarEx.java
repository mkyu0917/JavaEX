package com.javaex.basic.var;

public class VarEx {

		public static void main(String[] args){
			// 변수 식별자 부여
			// 문자, 숫자, $, _
			// 숫자로 시작하면 안됨
			
			// 변수명 관례(기본적으로 소문자로 작성하되 2개의 단어가 조합되면 뒷 단어의 첫글자는 대문자)
			/*
			int myAge; // 선언
			// 초기화
			myAge = 47; // = 할당표시
			*/
			int myAge = 47; // 선언과 할당 동시에
			
			// Type 선언된 변수는 다른 타입으로 쓸 수 없음
//			myAge = "마흔일곱";
	
			// 출력
			System.out.println(myAge);
			
			// 한번에 여러 변수를 선언할 때
			int v1 = 10, v2 = 20, v3 = 30;
			
			// 여러 변수에 동시에 같은 값을 할당할 때
			v1 = v2 = v3 = 40; //<--- 오른쪽에서 왼쪽으로 값이 들어감
			
			System.out.println(v1 + v2 + v3);
			
			
		}
}
