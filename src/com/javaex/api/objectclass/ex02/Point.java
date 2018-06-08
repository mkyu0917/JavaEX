package com.javaex.api.objectclass.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){//오버라이드
		return "Point(" + x + ", "+y+")";
				
	}
}
