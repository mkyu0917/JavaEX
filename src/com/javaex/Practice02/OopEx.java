package com.javaex.Practice02;


class cal{
	int i,j;
	public void init(int i, int j){
		this.i=i; //this�� ����� ������ �ش��ϴ� Ŭ������ ��� �޼ҵ忡 ��밡��
		this.j=j;
		
	}

	public void add(){
		System.out.println(this.i+this.j);
	}

}

public class OopEx {

	public static void main(String[] args){
		
		cal a = new cal(); //�ν��Ͻ�����, cal�̶�� Ŭ������ �ڷ������� ���
		a.init(6, 8);
		a.add();
	
		
}
}