package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args){
		StaticEx s1 = new StaticEx();
		System.out.println("RefCount:" + StaticEx.refCount);
	
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount:" + StaticEx.refCount);
		
		s1 = null; // 사용해제
		System.out.println("s1 해제");
		System.out.println("RefCount:" + StaticEx.refCount);
		
		System.gc(); //강제로 가비지컬렉터를 호출, 우선순위가 올라갈뿐 바로 출력되지는 않음
		try{
			Thread.sleep(3000);
			System.out.println("RefCount:" + StaticEx.refCount);
		}catch(Exception e){
			
		}
	}
	
}
