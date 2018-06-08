package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args){
		Animal dog1 = new Dog("snoopy"); //UPCASTING
		// <----방향 개가 동물로 
		dog1.eat();
		dog1.walk();
//		dog1.bark(); //못해요 애니멀은 bark가 없듬
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// 다운캐스팅: 명시적으로 타입을 지정
		((Dog)dog1).bark();
		//((Dog)dog1) 명시적표시 다운캐스팅
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		//pet.bark(); 고양이한테 없는 속성
		
		if(pet instanceof Dog){
			((Dog)pet).bark();
		}else if(pet instanceof Cat){
			((Cat)pet).meow();
		}
		
		
		
	}
}
