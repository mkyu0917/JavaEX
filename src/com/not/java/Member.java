package com.not.java;

import java.util.Scanner;

public class Member {	
				
	public String id, name;
	public int point;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getPoint() {
		return point;
	}
	public void showInfo(String string, String string2, int i) {
		
		System.out.println("�̸�: "+name +" ���̵�: "+id+ " ����Ʈ : "
				+point);
	
		
	}
	
	
	
	
	public static void main(String[] args) {
		Member mem = new Member();
		Scanner scan = new Scanner(System.in);
		
		String name1 = "��α�";
		String id1 = "mkyu0917";
		int point1 = 900;

		System.out.println("���� �̸�: "+name1+",  ����id: "+id1+", ��������Ʈ: "+point1);
		
		String name = scan.next();
		String id = scan.next();
		int point = scan.nextInt();
		
		
		
		
		mem.setId(id);
		mem.setName(name);
		mem.setPoint(point);
		mem.showInfo(id,name,point);
	}
		
	
	
}

