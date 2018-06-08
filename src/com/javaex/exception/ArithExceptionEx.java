package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
			//스캐너로부터 정수 입력
			//100을 정수로 나눈다.
		double result =0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		
		//오류 발생 가능 영역
		/*
		num = scanner.nextInt();
		result = 100/num;
		*/
		//오류 발생 가능 영역

		try{
			num = scanner.nextInt();
			result = 100/num;
		}catch(InputMismatchException e){ //기본java.lang패키지에 포함된게 아니라서 import 해야됨.
			System.out.println("한글입력은 안됨니다");
		}catch(ArithmeticException e){
			System.out.println("0으로는 나눌 수 없어요");
		}catch(Exception e){// (Exception e)는 모든 예외처리가능, 정확한 예외처리를 위해서 가장 마지막에 두는게 좋음
			e.printStackTrace(); //오류에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다

		}finally{
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();
	}

}
