package com.javaex.oop.shape.v1;

public class Circle extends Shape {
	// �ʵ�
	protected double radius; //������
	
	//������
	
	public Circle(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		
		System.out.printf("���� ���̴� [x=%d, y=%d, r=%f, area=%f]�� �׷Ⱦ��.",
				x, y,radius,area());
	}

	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius,2); //�����Լ�

		return area;
	}
	

}