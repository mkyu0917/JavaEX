package com.javaex.api.generic.ex30523;

public class BoxApp {

	public static void main(String[] args) {
		// BOX �ϳ� ����� INT ���� ����
		Box<String, Integer> intbox = new Box(); //<>�ȿ�   �ڽ��ȿ��� ����� Ÿ���� ����, �̹��� 2��  
		intbox.setKey("Integer");
		//intbox.key(123);
		intbox.setContent(123);
		//intbox.setContent("Java"); //�����Ͻ� Ÿ���� �´��� üũ�ؼ� �������� ������
		
		//���� ������ ���ô�
		//int retVal = (int)intbox.getContent(); //���ʿ� ����ִ� ����Ʈ Ÿ���� object �츮�� �޾ƾ��� ���� int���� int������ typeCasting�ؾߵ�
		int retVal = intbox.getContent();	// �տ��� IntegerŸ������ �ϰڴٰ� �ν��Ͻ��� �����Ͽ� Casting ���ʿ�
		System.out.println(intbox.getKey());
		System.out.println(retVal);
		
		Box<String, String> strBox = new Box(); ////<>�ȿ�   �ڽ��ȿ��� ����� Ÿ���� ���� version2
		strBox.setKey("String");
		strBox.setContent("Java");
		
		//String strVal = (String)strBox.getContent();//���ó� objectŸ���̱� ������ ��������� Ÿ�����κ�ȯ
		String strVal = (String)strBox.getContent(); // ���ó� String Ÿ������ �ϰڴٰ� �����ؼ� Casting���ʿ�
		System.out.println(strBox.getKey());
		System.out.println(strVal);
		
		//Effective Java��� å�� ���� �߿��׸���, (abstract���� interface�� ����϶�, �����ϸ� generic�� Ȱ���϶�, �迭���� collection�� ����϶� _
		
		// ���� ĳ������ �߸� �ߵ���?
		//strVal = (String)intbox.getContent(); //class casting exception 
		// ������ Ÿ�Կ��� üũ: ������Ȯ��
	}

}
