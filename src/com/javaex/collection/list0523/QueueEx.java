package com.javaex.collection.list0523;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>(); // ������ ������� ���� LiskedList�ε� Queue�� �������̽� �� ť�� ����� ��ɾ���, new queue�ȵ�; 
												   //FIFO First in First out ó������ �������� ��
		
		// �����͸� �����غ��ô�.
		for(int i =0; i< 10; i++){
		queue.offer(i);
	}
		System.out.println(queue);
		
		System.out.println(queue.poll()); // ����
		System.out.println(queue);
		System.out.println(queue.peek()); // ���� ���ϰ� ���� ������
		System.out.println(queue);
		
		// poll�� �Ҷ��� empty�� üũ ���ּ���.
		while(!queue.isEmpty()) { //������� ���� ��쿡�� ���� ���θ� �������ּ���
			System.out.println(queue.poll());
		}
}
}