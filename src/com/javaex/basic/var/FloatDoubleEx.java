package com.javaex.basic.var;

public class FloatDoubleEx {

	public static void main(String[] args){
		float floatVar = 3.14159F; // F�� �Ἥ Float���� �˸�, ��ҹ��� ���������
		double doubleVar = 3.14159;
		
		// ���е� üũ
		doubleVar = 0.1234567890123456789;
		floatVar = 0.1234567890123456789f;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		// e ����� ǥ��
		
		int intVar = 3000000;
		doubleVar = 3E6; //E�� 10�� X�� , ���⼭�� 10^6
		floatVar = 3E5f;
		
		System.out.println("int:" + intVar);
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
		// �ε��Ҽ��� ����� ������
		
		System.out.println(0.1 * 3);
	}
}
