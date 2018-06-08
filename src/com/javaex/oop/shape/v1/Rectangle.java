package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {
	
	//�ʵ� �߰�
	
	protected int width;
	protected int height;
	
	//������
	public Rectangle(int x, int y, int width, int height){
		super(x,y);
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double area(){
		return width * height;
	}
	@Override
	public void draw(){
		System.out.printf("�簢��[x=%d, y=%d, w=%d, h=%d, area=%f]�� �׷Ⱦ��.%n",
				x, y, width, height, area());
	}

}
