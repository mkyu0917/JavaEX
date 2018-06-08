package com.javaex.api.objectclass.ex04;


public class Point implements Cloneable {
	
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
	public Point getClone(){
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
