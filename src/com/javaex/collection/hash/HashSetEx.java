package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//����
		HashSet<String> hs = new HashSet<>();
	
		//��ü �߰�
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs); // �ߺ��� Java�� �ߺ��� �����ϰ� 1�� ���
		System.out.println("hs size: "+hs.size());
		
		// ������ ��ü�� �����ϰ� �ִ°�? : contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
	
		// ��ü ����
		hs.remove("C++");
		System.out.println(hs);
		
		// ��ü  �߰�
		hs.add("C++");
		System.out.println(hs);
	}

}
