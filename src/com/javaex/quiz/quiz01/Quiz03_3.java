package com.javaex.quiz.quiz01;

public class Quiz03_3 {
     public static void main(String[] args){
    	 System.out.println("1" + "3"); // ""<- 문자열 string
    	 System.out.println(true + "Java");// 문자열그대로
    	 System.out.println('A' + 'B'); // ''<- char형
    	 System.out.println((char)('1' + 2)); //숫자값
    	 System.out.println('J' + "ava");//문자열과 + 연산되면 거의 문자열로나옴
    	// System.out.println(false ); //null은 쓰레기 값이 들어가 있기 때문에
    	 char ch1 = 131;
    	 
    	 System.out.println(ch1);
     }
}
