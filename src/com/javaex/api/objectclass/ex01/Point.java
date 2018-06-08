package com.javaex.api.objectclass.ex01;

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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Point) {
			Point other = (Point)obj; //다운캐스팅
			return x == other.x && y == other.x;
		}
		return super.equals(obj);
	}
	
	
}
