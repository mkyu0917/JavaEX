package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
			//��ĳ�ʷκ��� ���� �Է�
			//100�� ������ ������.
		double result =0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		
		//���� �߻� ���� ����
		/*
		num = scanner.nextInt();
		result = 100/num;
		*/
		//���� �߻� ���� ����

		try{
			num = scanner.nextInt();
			result = 100/num;
		}catch(InputMismatchException e){ //�⺻java.lang��Ű���� ���ԵȰ� �ƴ϶� import �ؾߵ�.
			System.out.println("�ѱ��Է��� �ȵʴϴ�");
		}catch(ArithmeticException e){
			System.out.println("0���δ� ���� �� �����");
		}catch(Exception e){// (Exception e)�� ��� ����ó������, ��Ȯ�� ����ó���� ���ؼ� ���� �������� �δ°� ����
			e.printStackTrace(); //�������� �޼����� �߻� �ٿ����� ã�Ƽ� �ܰ躰�� ������ ����Ѵ�

		}finally{
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();
	}

}
