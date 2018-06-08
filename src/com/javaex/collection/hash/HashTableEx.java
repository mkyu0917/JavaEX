package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	private String subject;
	private String roomName;
	
	// ������ �����
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
		 Map<String, ClassRoom> map = new Hashtable<>(); // ������ �߿����� ���� , key���� ���� �˻��� �Ұ��̱� ������
		  //<key, value>	
		 
		  // �ۿ� ������ �ֱ�
		 map.put("101", new ClassRoom("Java","R101")); 
		 map.put("201", new ClassRoom("C","R201"));
		 map.put("301", new ClassRoom("Python","R301"));
		 map.put("401", new ClassRoom("Linux","R401"));
		 
		 System.out.println(map);
		 // ������ ����.
		 
		 // �ۿ��� �����͸� ������ ���ô�: get() �޼���
		 System.out.println(map.get("301"));
		 
		 // ���� �����͸� ������ ���ô�.
		 map.put("201", new ClassRoom("C#", "R201")); //201�� ������ C�� c#���� ����
		 System.out.println(map.get("201"));
		 System.out.println(map);
		 
		 // Ű�� �ִ��� Ȯ���� ���ô�.
		 System.out.println(map.containsKey("301")); // Ű���ֱ⶧���� true 
		 System.out.println(map.containsKey("501")); // Ű�� ���� ������ false
		 
		 // subject�� Java�� ClassRoom�� �޾ƿ� ����
		System.out.println(map.containsKey("Java"));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		// Iterator
		System.out.println("Iterator ======");
		Iterator<String> it = map.keySet().iterator();
			
		 while(it.hasNext()) {
			 ClassRoom room = map.get(it.next()); // ����Ű�� �Ѿ��
			 System.out.println(room); // ����Ű���� ���
		 }
		
		 //���� ������ô�.
		map.clear();
		System.out.println(map);
	}

}
