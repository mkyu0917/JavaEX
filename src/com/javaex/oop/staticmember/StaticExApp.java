package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args){
		StaticEx s1 = new StaticEx();
		System.out.println("RefCount:" + StaticEx.refCount);
	
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount:" + StaticEx.refCount);
		
		s1 = null; // �������
		System.out.println("s1 ����");
		System.out.println("RefCount:" + StaticEx.refCount);
		
		System.gc(); //������ �������÷��͸� ȣ��, �켱������ �ö󰥻� �ٷ� ��µ����� ����
		try{
			Thread.sleep(3000);
			System.out.println("RefCount:" + StaticEx.refCount);
		}catch(Exception e){
			
		}
	}
	
}