package com.javaex.exception;

import java.io.IOException;

public class ThrowExceptApp {
 
	public static void main(String[] args){
		ThrowsExcept except = new ThrowsExcept();
		
		try{
		
		except.executeException();
		except.executeRuntimeException();
		}catch(RuntimeException e){
			System.out.println("Message: " + e.getMessage());
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
		System.out.println(except.divide(100, 0));
		}catch (ArithmeticException e){
			System.out.println("야레야레 0으론 못나눔");
		}
		}
}
