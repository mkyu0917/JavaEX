package com.javaex.practice;

public class TeacherRectangle {

		private int width;
		private int height;
		
		//»ý¼ºÀÚ
		public TeacherRectangle(int width, int height){
			this.width= width;
			this.height= height;
			
		}
		
		public int getArea(){
			return width * height;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof TeacherRectangle){
				TeacherRectangle other =(TeacherRectangle)obj;
				return getArea() == other.width * other.height;
			}
			return super.equals(obj);
		}
		
}
