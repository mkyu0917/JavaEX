package com.javaex.quiz02;

public class Quiz02_2 {
		
	public static void main(String[] args){
		
	
	int balls = 136 , cap = 10;
	int cnt = 136/10;
	
	//cnt = cnt + (balls % cap > 0 ? 1: 0);
	cnt += (balls % cap > 0 ? 1 : 0); // �������� �ѻ��ڰ��� ������ �������� 0���� ū���̸� ���� �� +1�� ���Ѵ�.
	System.out.println(cnt);
	}
}
