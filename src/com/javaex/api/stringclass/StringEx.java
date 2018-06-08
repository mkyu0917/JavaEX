package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
	
		String s1 ="Java"; // 리터럴, 변수가 달라도 저장된값은 같은메모리에
		String s2 = new String("Java");//메모리에 새로 만들기
		String s3 = "Java";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	
		//String 생성자
		
	 char[] letters = {'J','a','v','a'};
	 String s4 = new String(letters);

	 	// valueof 메소드
	 	String s5 = String.valueOf(3.14159f);
	 	
	 	// 유용한 메소드
	 	String  str = "Java Programming is Fun?";
	 	System.out.println(str.charAt(5));// 5번 인덱스의 char는 뭐냐
	 	System.out.println(str.indexOf("Fun"));
	 	System.out.println(str.indexOf("fun")); // -1이 나오면 뒤에 없다는 소리다.
	 	
	 	//  replace
	 	
	 	System.out.println(str.replace('?', '!'));
	 	System.out.println(str.replaceAll("Fun", "ddong"));
	 	System.out.println(str); // 변경해도 메모리를 항상 새로운곳에 저장함 
	 	
	 	String s6 = "                Hello      ";
	 	String s7 = ",java";
	 	
	 	s6 = s6.trim(); // whitespace날리기 공백날리기
	 	System.out.println(s7+s6);
	 	
	 	//문자열 분리 split();
	 	
	 	String[] split = str.split(" ");// 문자를 스페이스 기준으로 자름
	 	System.out.println(split);
	 	
	 	for(String  data: split){
	 		System.out.println(data);
	 	}
	}
		
	}


