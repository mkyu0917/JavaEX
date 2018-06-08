package com.javaex.oop.shape.v2;

public abstract class Shape { //추상클래스 선언
	
	//필드
	 protected int x;
	 protected int y;
	 
	 public Shape(int x, int y){
		 this.x = x;
		 this.y = y;
		 
	 }
	 
	 // 추상 메소드 선언
//	 public abstract void draw();// 인터페이스에 위임
	 public abstract double area();  
	
}
