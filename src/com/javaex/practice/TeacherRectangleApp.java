package com.javaex.practice;

public class TeacherRectangleApp {
public static void main(String[] args){
		
		TeacherRectangle a= new TeacherRectangle(6, 4);
		TeacherRectangle b= new TeacherRectangle(2, 12);
		TeacherRectangle c= new TeacherRectangle(3, 3);
		TeacherRectangle d= c;
		
		System.out.println(a.getArea());
		// a�� b�� ���� ��
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
		
	}
}
