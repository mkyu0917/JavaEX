package com.javaex.oop.staticmember;

public class StaticEx {
	
	public static int refCount; //Ŭ�������� �ν��Ͻ� �����Ҵ븶�� +1 �پ�鶧 -1
	public static String ClassVar; // Ŭ��������
	public String instatnceVar; // �ν��Ͻ� ����
	
	//����ƽ ������� Ŭ���� ���� �ʱ�ȭ
	static {
		refCount = 0;
		ClassVar = "Static Member";
		System.out.println("Static Block");
		//instancevar = "Instance Var";
	}
	//������
	public StaticEx(){
		refCount++;
		System.out.println("refCount:" + refCount);
		System.out.println("Instance Created");
	}
	
	protected void finalize() throws Throwable{
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
}
