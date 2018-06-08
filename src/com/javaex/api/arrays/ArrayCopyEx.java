package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		//����
		//���� ��� ȸ���
		
		char src[] = "Java Programming".toCharArray();//���ڿ��� chararray�� �ٲٴ°�
		//�̷� �͵� �ֽ��ϴ�.
		
		//System�� �̿��� copy
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println(target);
		
		// Array.copyOf�� �̿��� copy
		target = Arrays.copyOf(src, src.length);
		System.out.println(target);
		
		// �� �� ī ��
		target = Arrays.copyOfRange(src,5,src.length);
		System.out.println(target);
		
	}

}
