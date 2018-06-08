package com.javaex.practice;

import com.javaex.api.objectclass.ex01.Point;

public class Rectangle {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle( int width, int height){
		this.width = width;
		this.height = height;
	}
	public int sumRectangle(){
		
		return width * height;
	
	}
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle rt = (Rectangle)obj; //다운캐스팅
			return sumRectangle()==rt.height * rt.width ;
		}
		return super.equals(obj);
	}
}
