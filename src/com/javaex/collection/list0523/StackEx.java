package com.javaex.collection.list0523;

import java.util.Stack;

public class StackEx {
		
		public static void main(String[] args) {
			
			//���� ����
			Stack<Integer> stack = new Stack<>(); //Last in First out
			
			//���� 10�� push
			for(int i=0; i< 10; i++) {
				stack.push(i);
			}
			System.out.println(stack);
			
			// pop �غ��ô�: ��� ��ġ�� Ȯ��
			System.out.println(stack.pop()); // ���� �������� �ִ� ���� �̾Ƴ�
			System.out.println(stack);		 // ������ �� 9 ���� ������
			
			//peek�� �غ��ô�.
			System.out.println(stack.peek());// ��ü�� ���ܵ� ���� ������
			System.out.println(stack);
			/*
			while(true) {// ��� ������ ����
				System.out.println(stack.pop());
			}*/
			
			while(!stack.empty()) {// ������ ������� �������� �����ϰڴ�.
				System.out.println(stack.pop());
			}

		}
}
