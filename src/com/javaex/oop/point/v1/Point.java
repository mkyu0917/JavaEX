package com.javaex.oop.point.v1;

public class Point {
	// v1.
	// �ʵ�
	
	private int x;
	private int y;
	
	//getters/setters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�.\n", 
				x,y);
		
	}
}