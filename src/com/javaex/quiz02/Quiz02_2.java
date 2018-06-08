package com.javaex.quiz02;

public class Quiz02_2 {
		
	public static void main(String[] args){
		
	
	int balls = 136 , cap = 10;
	int cnt = 136/10;
	
	//cnt = cnt + (balls % cap > 0 ? 1: 0);
	cnt += (balls % cap > 0 ? 1 : 0); // 공나누기 한상자공의 갯수를 나눈값이 0보다 큰값이면 나눈 몫에 +1를 더한다.
	System.out.println(cnt);
	}
}
