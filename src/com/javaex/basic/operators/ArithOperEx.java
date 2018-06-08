package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args){
	
		int a = 7;
		int b = 3;
		
		// ��ȣ ������ : +, - (����������� �켱���� �� ����)
		System.out.println(-a);
		System.out.println(-1*a);
		System.out.println("--------");
		
		// ��Ģ����
		a = 7;
		System.out.println(a + b); // ����
	    System.out.println(a - b); // ����
	    System.out.println(a * b); // ����
	    System.out.println(a / b); // ������
	    System.out.println(a % b); // ������
	    System.out.println("--------");
		
	    // ������ ������ �������� ����
	    System.out.println((float)a/(float)b);
	    System.out.println((float)a/b);// �Ϲ������� ���� �ڷ������� ���� float > int
	    System.out.println("--------");
	    
	    // ���������� ++, --
	    // ++a �� a++�� ȥ����������
	    System.out.println(a);
	    System.out.println(++a);//������ �Ĵ��� , ���ϰ� ���
	    System.out.println(a);
	    System.out.println("--------");
	    System.out.println(b);
	    System.out.println(b++);//������ ������ , ����ϰ� ����
	    System.out.println(b);
	    System.out.println("--------");
	
	    // ������ ����
	    //System.out.println(4 / 0); ArithmeticException
	    System.out.println(4.0 / 0); //Infinity
	    
	    System.out.println(7 % 4);
	    System.out.println(7.2 % 2.0); // ����, �����ִ� ����
	    
	    // Infinite�� üũ
	     System.out.println(Double.isInfinite(4.0 / 0)); //wrapperclass = �⺻Ÿ��(int, char, float ETC..)���� ��ü�� ����
	    // NaN
	    System.out.println(Double.isNaN(4.0 / 0));
	    
	}
	
}
