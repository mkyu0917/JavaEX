package com.javaex.basic.operators;

public class ConditionalOperEx {
		public static void main(String[] args){
			// 3�� ������ (Conditional Operator)
			
			int a, b;
			a = 10;
			b = 30;
			
			boolean result;
			
			result = a % 2 == 0 ? true: false; // ���ǽ� ? �� �Ǵ� �����(true) : �� �Ǵ� �����(false)
			System.out.println( a + "�� ¦��?" + result);
		
			String message;
			int score = 85;
			
			message = (score >= 80) ? "good" : 
								(score < 50) ? "fail": "Pass";
			System.out.println("Score: " + score
					+ ", Result: " + message);
				
		}
}
