package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args){
		//�⺻�˻�
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(nums, 6);
		System.out.println(nums + "6�� �ε���:" + index);
		
		//String�˻� : ����Ÿ�԰˻�
		//Ȯ���ʿ�
		String[] str = {"Java","c","c++","python","Linux"};
		
		Arrays.sort(str);// binarySerarch�� ��Ʈ�� ���� �ؾ��Ѵ�.
		System.out.println(Arrays.toString(str));
		
		int index2 = Arrays.binarySearch(str, "Linux");
		System.out.println("�ε���: "+ index);
		
		
	}
	
}
