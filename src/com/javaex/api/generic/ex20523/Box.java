package com.javaex.api.generic.ex20523;

// Generic 이용

public class Box<T> { //T는 지정되지 않은 타입, 내부에서 사용할 타입을 외부에서 결정한다.
		T content;
		
		public T getContent() {// 리턴값도 정해질값으로 지정
			return content;
		}
		public void setContent(T content) { // 받아오는 값도 외부에서 정해준 값으로 받아옴.
			this.content = content;
		}
		
}
