package com.javaex.api.generic.ex20523;

public class BoxApp {

	public static void main(String[] args) {
		// BOX �ϳ� ����� INT ���� ����
		Box<Integer> intbox = new Box(); //<>�ȿ�   �ڽ��ȿ��� ����� Ÿ���� ���� 
		intbox.setContent(123);
		//intbox.setContent("Java"); //�����Ͻ� Ÿ���� �´��� üũ�ؼ� �������� ������
		
		//���� ������ ���ô�
		//int retVal = (int)intbox.getContent(); //���ʿ� ����ִ� ����Ʈ Ÿ���� object �츮�� �޾ƾ��� ���� int���� int������ typeCasting�ؾߵ�
		int retVal = intbox.getContent();	// �տ��� IntegerŸ������ �ϰڴٰ� �ν��Ͻ��� �����Ͽ� Casting ���ʿ�
		System.out.println(retVal);
		
		Box<String> strBox = new Box(); ////<>�ȿ�   �ڽ��ȿ��� ����� Ÿ���� ���� version2
		strBox.setContent("Java");
		
		//String strVal = (String)strBox.getContent();//���ó� objectŸ���̱� ������ ��������� Ÿ�����κ�ȯ
		String strVal = (String)strBox.getContent(); // ���ó� String Ÿ������ �ϰڴٰ� �����ؼ� Casting���ʿ�
		System.out.println(strVal);
		
		// ���� ĳ������ �߸� �ߵ���?
		//strVal = (String)intbox.getContent(); //class casting exception 
		// ������ Ÿ�Կ��� üũ: ������Ȯ��
	}

}
