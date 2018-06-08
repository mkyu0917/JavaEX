package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	// 필드
	protected double radius; //반지름
	
	//생성자
	
	public Circle(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		
		System.out.printf("원의 넓이는 [x=%d, y=%d, r=%f, area=%f]를 그렸어요.",
				x, y,radius,area());
	}

	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius,2); //수학함수

		return area;
	}
	

}
