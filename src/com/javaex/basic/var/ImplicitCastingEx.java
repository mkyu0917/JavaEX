package com.javaex.basic.var;

public class ImplicitCastingEx {

	
				public static void main(String[] args){
					byte b = 25; // 1바이트 정수형
					System.out.println(b);
					
					short s = b; // 2바이트 정수형
					System.out.println(s);
					
					int i = s; // 4바이트 정수형
					System.out.println(i);
					
					float f = i;
					System.out.println(f);
					
					double d = f;
					System.out.println(d);
					
					char ch = 'A'; // 2바이트 부호 없음
//					short s2 = ch; // 2바이트 부호 있음

					
					
				}
 }

