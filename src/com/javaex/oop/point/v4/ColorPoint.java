package com.javaex.oop.point.v4;

public class ColorPoint extends Point{
		private String color;
		
		// 부모의 생성자
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
		
		@Override //자바컴파일러에게 오버라이드된 메소드라고 알려줌, 부모를 찾아가서 확인
		public void draw(){
			System.out.printf("색깔점[color=%s, x=%d, y=%d]을 그렸습니다.%n",
				 color, x, y);
		}
}