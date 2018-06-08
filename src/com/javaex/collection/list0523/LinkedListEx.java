package com.javaex.collection.list0523;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
			List<String> l = new LinkedList<String>();
		
			// ��ü�߰�
			l.add("Java");	// ������ �� �ڿ� �� ������ �߰�
			l.add("C");
			l.add("Python");
			l.add("C++");
			
			// ��ü �߰��� ����
			l.add(2, "C#");
			System.out.println(l);
			
			l.add("Java");
			System.out.println(l);
			System.out.println("size:" + l.size());
			//System.out.println("Capacity:" + l.capacity());
			//capacityȮ���Ҽ� ����
			
			//��ü��  ���� : �ε����� ����
			l.remove(2);
			//��ü�� ����: �־��� ��ü ������ ����
			l.remove("Python");
			System.out.println(l);
			
			// List, Set ����� Iterator�� ���
		
			Iterator<String> it = l.iterator();
			while(it.hasNext()) {
				String item = it.next();
				System.out.println(item);
			}
			
			// ��� ���ô�.
			 l.clear();
			 System.out.println(l);
	}

}
