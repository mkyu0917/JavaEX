package com.javaex.collection.list0523;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>(); // 실제로 만들어진 것은 LiskedList인데 Queue가 인터페이스 라서 큐에 노출된 명령어만사용, new queue안됨; 
												   //FIFO First in First out 처음들어간게 먼저나옴 ㅋ
		
		// 데이터를 제공해봅시다.
		for(int i =0; i< 10; i++){
		queue.offer(i);
	}
		System.out.println(queue);
		
		System.out.println(queue.poll()); // 인출
		System.out.println(queue);
		System.out.println(queue.peek()); // 삭제 안하고 값만 참조함
		System.out.println(queue);
		
		// poll을 할때는 empty로 체크 해주세요.
		while(!queue.isEmpty()) { //비어있지 않은 경우에는 루프 내부를 실행해주세요
			System.out.println(queue.poll());
		}
}
}