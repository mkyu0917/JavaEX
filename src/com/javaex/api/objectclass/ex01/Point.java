package com.javaex.api.objectclass.ex01;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){//�������̵�
		return "Point(" + x + ", "+y+")";
				
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Point) {
			Point other = (Point)obj; //�ٿ�ĳ����
			return x == other.x && y == other.x;
		}
		return super.equals(obj);
	}
	
	
}
