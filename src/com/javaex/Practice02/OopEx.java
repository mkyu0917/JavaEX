package com.javaex.Practice02;


class cal{
	int i,j;
	public void init(int i, int j){
		this.i=i; //this는 사용한 변수는 해당하는 클래스의 모든 메소드에 사용가능
		this.j=j;
		
	}

	public void add(){
		System.out.println(this.i+this.j);
	}

}

public class OopEx {

	public static void main(String[] args){
		
		cal a = new cal(); //인스턴스선언, cal이라는 클래스를 자료형으로 사용
		a.init(6, 8);
		a.add();
	
		
}
}