package com.javaex.conditional;

import java.util.Scanner;

public class SwitchCaseEx {
		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			
		    System.out.println("과목을 선택하세요.");
		    System.out.println("1.자바 " + "2.C " + "3.C++ " + "4. Phython");
		    int subject = scan.nextInt();
		    switch(subject){
		    case 1 : System.out.println("R101호 입니다.");
		    	break;
		    case 2 : System.out.println("R202호 입니다.");
		    	break;
		    case 3 : System.out.println("R303호 입니다.");
		    	break;
		    case 4 : System.out.println("R404호 입니다.");
	    		break;	
	    	default : System.out.println("관리자에게 문의하세요.");
	    		break;  // 생략해도 됨 defualt는 특수한 케이스 제외하고
		    }
		}
}
