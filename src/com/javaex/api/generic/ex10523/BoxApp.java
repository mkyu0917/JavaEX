package com.javaex.api.generic.ex10523;

public class BoxApp {

	public static void main(String[] args) {
		// BOX �ϳ� ����� INT ���� ����
		Box intbox = new Box();
		intbox.setContent(123);
		
		//���� ������ ���ô�
		int retVal = (int)intbox.getContent(); //���ʿ� ����ִ� ����Ʈ Ÿ���� object �츮�� �޾ƾ��� ���� int���� int������ typeCasting�ؾߵ�
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();//���ó� objectŸ���̱� ������ ��������� Ÿ�����κ�ȯ
		System.out.println(strVal);
		
		// ���� ĳ������ �߸� �ߵ���?
		strVal = (String)intbox.getContent(); //class casting exception 
	}

}
