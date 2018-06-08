package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMessage();// 매개변수, 리턴 없는 메소드
		
		double squared= square(3.5);
		System.out.println(squared);
		
		System.out.println("4 + 5 = " + getSum(4,5));
		
		printDivide(4,0);
	}
	
	public static void printDivide(int num1, int num2){
		if(num2==0){
			System.out.println("0으로 나눌 수 없어요.");
			return;//뒤에것을 실행하지않고 불러냈던 메소드자리로 돌려보내서 출력
		}
		System.out.println(num1/num2);
	}
	
	// 매개변수는 개수 제한은 없음
	public static double getSum(double num1,double num2){
		return num1 + num2;
	}
	public static void printMessage(){ //메소드
		System.out.println("Message");
		
	}
	
	//리턴값과 매개변수가 있는 메소드
	public static double square(double num){
		return num * num;
	}
}
