package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
	
		String s1 ="Java"; // ���ͷ�, ������ �޶� ����Ȱ��� �����޸𸮿�
		String s2 = new String("Java");//�޸𸮿� ���� �����
		String s3 = "Java";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	
		//String ������
		
	 char[] letters = {'J','a','v','a'};
	 String s4 = new String(letters);

	 	// valueof �޼ҵ�
	 	String s5 = String.valueOf(3.14159f);
	 	
	 	// ������ �޼ҵ�
	 	String  str = "Java Programming is Fun?";
	 	System.out.println(str.charAt(5));// 5�� �ε����� char�� ����
	 	System.out.println(str.indexOf("Fun"));
	 	System.out.println(str.indexOf("fun")); // -1�� ������ �ڿ� ���ٴ� �Ҹ���.
	 	
	 	//  replace
	 	
	 	System.out.println(str.replace('?', '!'));
	 	System.out.println(str.replaceAll("Fun", "ddong"));
	 	System.out.println(str); // �����ص� �޸𸮸� �׻� ���ο���� ������ 
	 	
	 	String s6 = "                Hello      ";
	 	String s7 = ",java";
	 	
	 	s6 = s6.trim(); // whitespace������ ���鳯����
	 	System.out.println(s7+s6);
	 	
	 	//���ڿ� �и� split();
	 	
	 	String[] split = str.split(" ");// ���ڸ� �����̽� �������� �ڸ�
	 	System.out.println(split);
	 	
	 	for(String  data: split){
	 		System.out.println(data);
	 	}
	}
		
	}


