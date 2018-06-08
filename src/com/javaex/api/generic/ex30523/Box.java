package com.javaex.api.generic.ex30523;

// Generic 이용

public class Box<K, V> { 
		K key;
		V content;
		
		public V getContent() {// 리턴값도 정해질값으로 지정
			return content;
		}
		public void setContent(V content) { // 받아오는 값도 외부에서 정해준 값으로 받아옴.
			this.content = content;
		}
		
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		
}
