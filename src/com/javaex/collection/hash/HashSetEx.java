package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		//선언
		HashSet<String> hs = new HashSet<>();
	
		//객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs); // 중복된 Java는 중복을 인지하고 1개 출력
		System.out.println("hs size: "+hs.size());
		
		// 지정한 객체를 포함하고 있는가? : contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
	
		// 객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
		// 객체  추가
		hs.add("C++");
		System.out.println(hs);
	}

}
