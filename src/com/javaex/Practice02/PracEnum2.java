package com.javaex.Practice02;

public class PracEnum2 {
	
		public static void main(String[] args){
		
			/*Today day = Today.TUESDAY; 
			
			
			if(day == Today.SATURDAY){
				System.out.println("Today is "+day);
			}else if(day == Today.MONDAY){
				System.out.println("Today is "+day);
			}else{
				System.out.println("너 잘못고름");
			}
			
			//System.out.println("It\'s day: " + day);
			*/
		
			
			Name id = Name.송승헌;
			
			String name = id.name(); // 열거형의 이름을 반환해주는 메소드
			System.out.println("name(): "+name);
			
			int ord = id.ordinal();
			System.out.println("ordinal(): "+ord); //열거형의 성분이 어디 위치에 있는지 ex) 송승헌은 2번째
			
			Name vlo = id.valueOf("이병헌");
			System.out.println("same name= "+ vlo);
			
	
			//System.out.println("이름이 송씨인 사람은? " + id);
			
			if(id==Name.이병헌){
				System.out.println("오늘 너 로맨틱 성공적..."+id);
				
			}else{
				System.out.println("멍청이");
			}
		
		}
}
