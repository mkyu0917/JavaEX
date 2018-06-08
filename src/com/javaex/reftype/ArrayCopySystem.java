package com.javaex.reftype;

public class ArrayCopySystem {

	public static void main(String[] args){
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(	source, 		//�����迭
							0, 				//�����ε���
							target, 		//Ÿ�� �迭
							3, 				//Ÿ�� �迭�� �ε��� 
							source.length);	//������ ����
		
		for(int i=0; i < target.length; i++){
			System.out.print(target[i] + " ");
		}
			System.out.println();
		
			//Enhanced For
			for (int val:target){
				System.out.print(val + " ");
			}
			System.out.println();
	}

}

