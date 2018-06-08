package com.javaex.oop.point.v4;

public class ColorPoint extends Point{
		private String color;
		
		// �θ��� ������
		public ColorPoint(){
			super();
		}
		
		public ColorPoint(String color){
			super();
			this.color = color;
		}
		
		public ColorPoint(int x, int y, String color) {
			super(x,y);
			this.color = color;
		}
		
		//getter / setter
		public String getColor(){
			return color;
		}
		
		public void setColor(String color){
			this.color = color;
		}
		
		@Override //�ڹ������Ϸ����� �������̵�� �޼ҵ��� �˷���, �θ� ã�ư��� Ȯ��
		public void draw(){
			System.out.printf("������[color=%s, x=%d, y=%d]�� �׷Ƚ��ϴ�.%n",
				 color, x, y);
		}
}