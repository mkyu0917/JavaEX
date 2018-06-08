package com.javaex.api.arrays;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args){
		int[] scores = { 99, 55, 88, 10, 44, 55, 66};
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores);
		//Arrays.sort
		System.out.println(Arrays.toString(scores));
		
	}
}
