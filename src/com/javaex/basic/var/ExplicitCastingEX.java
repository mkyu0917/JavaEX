package com.javaex.basic.var;

public class ExplicitCastingEX {

	public static void main (String[] args ){
		
			byte b;
			int i = 2018;
			float f = 123.456f;
			
			b = (byte)i;
			System.out.println("int " + i 
					            + "-> byte: " +b );
			
			i = (int)f;
			System.out.println("float " + f 
					            + "-> int: " + i);
			
			b = (byte)f;
			System.out.println("float " + f
								+ "-> byte: "+ b);
			
			System.out.println("¿ÀÂ¡¾î" + "²Ã¶Ñ±â");
	
			System.out.println('2');
			
			char ch1 = 99;
			System.out.println(ch1);
	}
	
}
