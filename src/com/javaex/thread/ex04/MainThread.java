package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) {
			//쓰레드를 불러와 실행
		
			//Thread thread = new DigitThread();
			Thread thread = new Thread(new DigitThread());
			Thread thread2 = new Thread(new AlphabaetThread());
			
			thread.setPriority(Thread.MAX_PRIORITY);
			thread2.setPriority(Thread.MAX_PRIORITY );
			
			thread.start();
			thread2.start();
		
	
			//출력속도 지연
			try {
				Thread.sleep(300);
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인쓰레드 종료");
		}
}
			//Thread thread2 = new AlphabaetThread();
			
		
