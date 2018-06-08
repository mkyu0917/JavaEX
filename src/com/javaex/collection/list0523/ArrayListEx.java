package com.javaex.collection.list0523;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
	
		public static void main(String[] args) {
			//List<String> l = new ArrayList<String>();
			List<String> l = new LinkedList<>(); // 처리방법은 다르지만 사용방법은 같다. 중간에 삽입이 빈번하지 않으면 ArrayList로 변경하여 사용해도 좋음
			//객체 추가
			l.add("Java");
			l.add("C");
			l.add("C++");
			l.add("Python");
			
			//객체의 삽입
			l.add(2, "C#");
			
			// List는 중복을 허용
			l.add("Java");
			System.out.println(l);
			System.out.println("총 객체 수 : "+ l.size());
			
			// 객체의 삭제
			l.remove(2);
			l.remove("Python");
			System.out.println(l);
			
			//Iterator의 사용
			System.out.println("Iterator ===========");
			
			Iterator<String> it = l.iterator();
			while(it.hasNext()) {
				String item = it. next();
				System.out.println(item);
			}
			
			// 비워봅시다.
			l.clear();
			System.out.println(l);
		}
}
