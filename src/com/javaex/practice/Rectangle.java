package com.javaex.practice;

import com.javaex.api.objectclass.ex01.Point;

public class Rectangle {
	
	//�ʵ�
	private int width;
	private int height;
	
	//������
	public Rectangle( int width, int height){
		this.width = width;
		this.height = height;
	}
	public int sumRectangle(){
		
		return width * height;
	
	}
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle rt = (Rectangle)obj; //�ٿ�ĳ����
			return sumRectangle()==rt.height * rt.width ;
		}
		return super.equals(obj);
	}
}
