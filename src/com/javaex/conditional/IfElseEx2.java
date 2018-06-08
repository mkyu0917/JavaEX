package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.자바 "+ "2.C "+"3.C++ "+"4.파이썬");
		int subject = scanner.nextInt();
		
		if(subject == 1){
			System.out.println("R101호 입니다.");
		}else if(subject == 2){
			System.out.println("R202호 입니다.");
		}else if(subject == 3){
			System.out.println("R303호 입니다.");
		}else if(subject == 4){
			System.out.println("R404호 입니다.");
		}else{
			System.out.println("관리자에게 문의하세요.");
		}
	}
}
