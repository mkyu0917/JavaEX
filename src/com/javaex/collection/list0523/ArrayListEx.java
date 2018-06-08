package com.javaex.collection.list0523;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
	
		public static void main(String[] args) {
			//List<String> l = new ArrayList<String>();
			List<String> l = new LinkedList<>(); // ó������� �ٸ����� ������� ����. �߰��� ������ ������� ������ ArrayList�� �����Ͽ� ����ص� ����
			//��ü �߰�
			l.add("Java");
			l.add("C");
			l.add("C++");
			l.add("Python");
			
			//��ü�� ����
			l.add(2, "C#");
			
			// List�� �ߺ��� ���
			l.add("Java");
			System.out.println(l);
			System.out.println("�� ��ü �� : "+ l.size());
			
			// ��ü�� ����
			l.remove(2);
			l.remove("Python");
			System.out.println(l);
			
			//Iterator�� ���
			System.out.println("Iterator ===========");
			
			Iterator<String> it = l.iterator();
			while(it.hasNext()) {
				String item = it. next();
				System.out.println(item);
			}
			
			// ������ô�.
			l.clear();
			System.out.println(l);
		}
}
