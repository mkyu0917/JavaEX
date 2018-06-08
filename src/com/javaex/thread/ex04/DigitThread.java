package com.javaex.thread.ex04;

public class DigitThread implements Runnable{

	@Override
	public void run() { //source ->override ->run 메소드
		//새쓰레드의 실행의 흐름
	
		for(int i=0; i<30; i++) {
			System.out.println("DigitThread:" +i);
			
			//쓰레드 지연
			
			try{
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		super.run();
	}

		
			
}
