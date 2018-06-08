package com.javaex.reftype;

public class ArrayEx {
	
		public static void main(String[] args){
			//배열의선언
			String[] names;// Type[]
			int scores[]; // 식별자[] 
		
			//초기화
			names = new String[]{
					"김민규",
					"김민규2",
					"김민규3",
					"김민규4"
			};
		   // 값 목록이 있다면 
		    float height[] = {
				    175.3f,
				    170.2f,
				    165.2f,
				    188
		   }; // 선언과 동시에 할 때만 효과있음

		    scores= new int[4];
		    
		    // 인덱스 접근
		    // 0으로 시작
		    // 총 길이 -1 까지
		    
		    
		    scores[0] = 80;
		    scores[1] = 85;
		    scores[2] = 90;
		    scores[3] = 95;
		    //scores[4] = 100;  <-- 인덱스를 벗어난 접근이라 오류남
		    
		    for (int i= 0; i < scores.length; i++){
		    	System.out.printf("%s (%.2f) : score = %d%n", 
		    					names[i],
		    					height[i],
		    					scores[i]);
		    }
		    	
		    }
		}
		

