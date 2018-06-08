package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{ // 클래스 생성
	
		int num;
		
		public SimpleNum(int num) { //생성자
			this.num = num;
		}

		@Override //오버라이드
		public String toString() {
			return String.valueOf(num);
		}

		// hashCode, equals 오버라이드
		
		@Override
		public boolean equals(Object obj) { // 해시코드를 맞춰줘서 한번 거른다.
			if(obj instanceof SimpleNum) {
				SimpleNum other = (SimpleNum)obj;
				return num == other.num;
			}
			return super.equals(obj);
		}

		@Override
		public int hashCode() { // 해시코드에서 판단하여 범위안에 값을 어떻게 찾는가에 따라서 효율성이 달라짐
	// 		return super.hashCode();
			//return num%10; // 해시코드값을 10으로 나누어서 10개의 범위로 구분하여 찾음
			return num%2; //
			//return num; // 해쉬코드의 장점을 얻을 수 없음, 
			//해쉬코드를 구분하기 위해서 로직을 세울수 있어야함,8ㅡ88
		}
		
		
		
}

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20); // s2, s3가 메모리 주소번지가 다름 다른 객체가 맞음, 그러나 우리는 같은값이라 판단하지만 중복처리가 안됨, 같은 값이라는 것을 판단하는 것이 hashcode다.
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		System.out.println(s2.equals(s3));
	}

}
