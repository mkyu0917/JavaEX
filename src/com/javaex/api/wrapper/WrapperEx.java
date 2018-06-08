package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		
		// Wrapper�⺻: �����
		
		Integer i = new Integer (10);
		Character c = new Character('c');
		// jdk9 ���� new Wrapper�� deprecated
		
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		// ���ڿ��� �־ �˴ϴ�.
		Integer i1 = Integer.valueOf("10"); // ���ڿ��� integer�� �ڽ��Ѵ�.
		Double d1 = Double.valueOf("3.14159");
		Boolean b1 = Boolean.valueOf("false");
		// ��� ���ڿ��� ���°� �ش� �⺻���� ���¸� ������Ѵ�.
		
		// �ڵ��ڽ�(Autu Boxing)
		Integer i2 = 10; // == Integer i2 = Integer.valuof(10); <--- �� ������ ������
		
		//parse�迭 �޼��� : ���ڿ��� �̿�, �ش� Ÿ������ ��ȯ, �Ǵ� �ٸ� Ÿ������ ��ȯ
		System.out.println(Integer.parseInt("-123")); // ���ڿ�-> ����
		System.out.println(Integer.parseInt("10",16));// 16���� ���ڿ�-> ����
		System.out.println(Integer.toBinaryString(28));//������ ���ڿ��� ��ȯ		
		System.out.println(Integer.toHexString(28));  // 16���� ���ڿ���
		//����ȯ
		
		System.out.println(i2.doubleValue()); //Integer�� ��ȯ�ߴ� i2�� double�� ��ȯ
		System.out.println(i2.floatValue());  //i2�� float�� ��ȯ
		
		// ����� ���� ��
		Integer i3 = Integer.valueOf(2018); 
		Integer i4 = Integer.valueOf(2018);
		System.out.println(i3==i4);
		//�ΰ��� ��üȭ �Ǿ ����� �ּҰ��� �޶� false�� ����
		
		//��ڽ̺�
		System.out.println(i3.intValue()==i4.intValue());
		
		//��ڽ� ��2
		System.out.println(i3.equals(i4)); // ���� ������ �� , �⺻�� Ÿ���� ���� �ּҰ��� ���
	}

}
