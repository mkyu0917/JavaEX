package com.javaex.conditional;

import java.util.Scanner;

public class SwitchCaseEx {
		public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			
		    System.out.println("������ �����ϼ���.");
		    System.out.println("1.�ڹ� " + "2.C " + "3.C++ " + "4. Phython");
		    int subject = scan.nextInt();
		    switch(subject){
		    case 1 : System.out.println("R101ȣ �Դϴ�.");
		    	break;
		    case 2 : System.out.println("R202ȣ �Դϴ�.");
		    	break;
		    case 3 : System.out.println("R303ȣ �Դϴ�.");
		    	break;
		    case 4 : System.out.println("R404ȣ �Դϴ�.");
	    		break;	
	    	default : System.out.println("�����ڿ��� �����ϼ���.");
	    		break;  // �����ص� �� defualt�� Ư���� ���̽� �����ϰ�
		    }
		}
}
