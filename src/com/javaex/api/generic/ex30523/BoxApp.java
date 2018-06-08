package com.javaex.api.generic.ex30523;

public class BoxApp {

	public static void main(String[] args) {
		// BOX 하나 만들고 INT 값을 설정
		Box<String, Integer> intbox = new Box(); //<>안에   박스안에서 사용할 타입을 지정, 이번엔 2개  
		intbox.setKey("Integer");
		//intbox.key(123);
		intbox.setContent(123);
		//intbox.setContent("Java"); //컴파일시 타입이 맞는지 체크해서 안정성을 높여줌
		
		//값을 꺼내와 봅시다
		//int retVal = (int)intbox.getContent(); //안쪽에 들어있는 컨텐트 타입은 object 우리가 받아야할 것은 int으로 int형으로 typeCasting해야됨
		int retVal = intbox.getContent();	// 앞에서 Integer타입으로 하겠다고 인스턴스에 선언하여 Casting 불필요
		System.out.println(intbox.getKey());
		System.out.println(retVal);
		
		Box<String, String> strBox = new Box(); ////<>안에   박스안에서 사용할 타입을 지정 version2
		strBox.setKey("String");
		strBox.setContent("Java");
		
		//String strVal = (String)strBox.getContent();//역시나 object타입이기 때문에 실제사용할 타입으로변환
		String strVal = (String)strBox.getContent(); // 역시나 String 타입으로 하겠다고 선언해서 Casting불필요
		System.out.println(strBox.getKey());
		System.out.println(strVal);
		
		//Effective Java라는 책을 보면 중요항목중, (abstract보다 interface를 사용하라, 가능하면 generic을 활용하라, 배열보다 collection을 사용하라 _
		
		// 만약 캐스팅을 잘못 했따면?
		//strVal = (String)intbox.getContent(); //class casting exception 
		// 컴파일 타입에서 체크: 안정성확보
	}

}
