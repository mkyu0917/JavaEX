package com.javaex.Practice02;

public class Reference {

	public static void main(String[] args){
	
	//이렇게 선언되면 주소가다름
	String varName1="백치아다다";
	String varName2 = new String("김민규");
		
	// 스트링 값 비교
	String varName3="원빈";
	String varName4="원반";
	System.out.println(varName3.equals(varName4));
	
	//
	System.out.printf("Hello %s of %s%n","World","Java");
	
	
	}
	
}
