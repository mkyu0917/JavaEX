package com.javaex.oop.staticmember;

public class StaticEx {
	
	public static int refCount; //클래스변수 인스턴스 증가할대마다 +1 줄어들때 -1
	public static String ClassVar; // 클래스변수
	public String instatnceVar; // 인스턴스 변수
	
	//스태틱 블록으로 클래스 변수 초기화
	static {
		refCount = 0;
		ClassVar = "Static Member";
		System.out.println("Static Block");
		//instancevar = "Instance Var";
	}
	//생성자
	public StaticEx(){
		refCount++;
		System.out.println("refCount:" + refCount);
		System.out.println("Instance Created");
	}
	
	protected void finalize() throws Throwable{
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}
