package com.javaex.oop.shape.v1;

public class ShapeApp {
		
	public static void main(String[] args){
		//Shape s = new Shape(); // �Ӵ�
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 20, 30);
		c.draw();
	}

}
