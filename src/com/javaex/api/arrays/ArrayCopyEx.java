package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//복사
		//예전 방법 회고오
		
		char src[] = "Java Programming".toCharArray();//문자열을 chararray로 바꾸는검
		//이런 것도 있스니다.
		
		//System을 이용한 copy
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println(target);
		
		// Array.copyOf를 이용한 copy
		target = Arrays.copyOf(src, src.length);
		System.out.println(target);
		
		// 일 부 카 피
		target = Arrays.copyOfRange(src,5,src.length);
		System.out.println(target);
		
	}

}
