package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args){
		//기본검색
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(nums, 6);
		System.out.println(nums + "6의 인덱스:" + index);
		
		//String검색 : 참조타입검색
		//확인필요
		String[] str = {"Java","c","c++","python","Linux"};
		
		Arrays.sort(str);// binarySerarch는 소트를 먼저 해야한다.
		System.out.println(Arrays.toString(str));
		
		int index2 = Arrays.binarySearch(str, "Linux");
		System.out.println("인덱스: "+ index);
		
		
	}
	
}
