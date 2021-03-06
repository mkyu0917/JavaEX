package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		
		// 버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		
		// 문자열 추가:append()
		sb.append(" is pencil");
		sb.insert(8, "my");
		
		//문자열 치환 :
		
		sb.replace(8, 10, "your");
		
		System.out.println(sb);
		
		//sb.setLength(10); // 버퍼길이 변경 
		//System.out.println(sb);
		
		/*
		String s = new StringBuffer("This")
									.append(" is")
									.append(" pencil")
									.insert(8, "my")
									.replace(8, 10, "your ")
									.toString();
		*/							
		StringBuffer sb2 =new StringBuffer("This")
		.append(" is")
		.append(" pencil")
		.insert(8, "my")
		.replace(8, 10, "your ");
		
		String s = sb2.toString();
				
		
		System.out.println(s);
									
									
	
	}

}
