package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	private String subject;
	private String roomName;
	
	// 생성자 만들기
	public ClassRoom(String subject) {
		this.subject = subject;
		
	}
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return subject.hashCode();
	}
	@Override
	public String toString() {
		String output = "class(subject=" + subject
				+ ", room=" + roomName + ")";
		
		return output;
	}
	
	
}

public class HashTableEx {

	public static void main(String[] args) {
		 Map<String, ClassRoom> map = new Hashtable<>(); // 순서는 중요하지 않음 , key값에 의한 검색을 할것이기 때문에
		  //<key, value>	
		 
		  // 앱에 데이터 넣기
		 map.put("101", new ClassRoom("Java","R101")); 
		 map.put("201", new ClassRoom("C","R201"));
		 map.put("301", new ClassRoom("Python","R301"));
		 map.put("401", new ClassRoom("Linux","R401"));
		 
		 System.out.println(map);
		 // 순서는 없다.
		 
		 // 앱에서 데이터를 가져와 봅시다: get() 메서드
		 System.out.println(map.get("301"));
		 
		 // 맵의 데이터를 변경해 봅시다.
		 map.put("201", new ClassRoom("C#", "R201")); //201의 데이터 C를 c#으로 변경
		 System.out.println(map.get("201"));
		 System.out.println(map);
		 
		 // 키가 있는지 확인해 봅시다.
		 System.out.println(map.containsKey("301")); // 키가있기때문에 true 
		 System.out.println(map.containsKey("501")); // 키가 없기 때문에 false
		 
		 // subject가 Java인 ClassRoom을 받아와 보자
		System.out.println(map.containsKey("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		// Iterator
		System.out.println("Iterator ======");
		Iterator<String> it = map.keySet().iterator();
			
		 while(it.hasNext()) {
			 ClassRoom room = map.get(it.next()); // 다음키가 넘어옴
			 System.out.println(room); // 받은키값을 출력
		 }
		
		 //앱을 비워봅시다.
		map.clear();
		System.out.println(map);
	}

}
