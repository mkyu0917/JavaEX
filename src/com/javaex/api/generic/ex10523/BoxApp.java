package com.javaex.api.generic.ex10523;

public class BoxApp {

	public static void main(String[] args) {
		// BOX 하나 만들고 INT 값을 설정
		Box intbox = new Box();
		intbox.setContent(123);
		
		//값을 꺼내와 봅시다
		int retVal = (int)intbox.getContent(); //안쪽에 들어있는 컨텐트 타입은 object 우리가 받아야할 것은 int으로 int형으로 typeCasting해야됨
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();//역시나 object타입이기 때문에 실제사용할 타입으로변환
		System.out.println(strVal);
		
		// 만약 캐스팅을 잘못 했따면?
		strVal = (String)intbox.getContent(); //class casting exception 
	}

}
