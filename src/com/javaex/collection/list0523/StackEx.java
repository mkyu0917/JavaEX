package com.javaex.collection.list0523;

import java.util.Stack;

public class StackEx {
		
		public static void main(String[] args) {
			
			//스택 선언
			Stack<Integer> stack = new Stack<>(); //Last in First out
			
			//값을 10개 push
			for(int i=0; i< 10; i++) {
				stack.push(i);
			}
			System.out.println(stack);
			
			// pop 해봅시다: 출력 위치를 확인
			System.out.println(stack.pop()); // 제일 마지막에 있는 값을 뽑아냄
			System.out.println(stack);		 // 마지막 값 9 빼서 없ㅇ므
			
			//peek도 해봅시다.
			System.out.println(stack.peek());// 객체는 남겨둠 값만 참조함
			System.out.println(stack);
			/*
			while(true) {// 계속 팝으로 빼냄
				System.out.println(stack.pop());
			}*/
			
			while(!stack.empty()) {// 스택이 비어있지 않은동안 실행하겠다.
				System.out.println(stack.pop());
			}

		}
}
