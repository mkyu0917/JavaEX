package com.javaex.Practice02;

public class PracArray {

	public static void main(String[] args){
		
		//�迭�� �����ϴ� �ΰ������
		
		//1.Ÿ��[]����;
	//	int[] intArray;
		
		//2.Ÿ�� ����[];
	//	String StrArray[];
	
		
		/*
		char[] c = new char[3];
		
		c[0] = 'b';
		c[1] = 'c';
		c[2] = 'd';
		
		System.out.println(c[2]);
		*/
		
		//�迭�� �ʱ�ȭ
		//1.���� ����� {}���� �����Ͽ� �ʱ�ȭ
		String[] Array ={ "��", "��", "��", "��", "��", "��", "��", "��"};
		System.out.println(Array[1] + Array[3]);
		
		//2. �迭������ new Ÿ��[]{}���ε� ���𰡴�
		String[] Array2;
		
		Array2 = new String[]{ "������","������","������",};
		System.out.println(Array2[1]);
		
		//3. new�����ڷ� �迭 ����
			int[] intArray = new int[3]; //new int[3] 3�� �迭�� ũ�� �迭�� ũ��� �迭-1
			intArray[0] = 3;
			intArray[1] = 4;
			intArray[2] = 5;
		   /*
			for(int i=0; i<3; i++){ // �迭�� ���� for������ ����
				System.out.println(intArray[i]);
			}
			for(int i=0; i<intArray.length; i++){//�迭�� ���� length�� ���ϱ�
				System.out.println(intArray[i]);
			}
			*/
			
			int result =0;
			for(int i=0; i<intArray.length; i++){ // �迭�� ���� for������ ����
			 result =+i;	
			}
			System.out.println(intArray[3]);// <-- �迭�� 0���� ������
			
		}
	}

