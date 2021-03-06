package com.javaex.oop.point.v2;

public class Point {
	// v2.
	// 필드
	
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
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
		System.out.printf("점[x=%d, y=%d]를 그렸습니다.\n", 
				x,y);
		
	}

}
