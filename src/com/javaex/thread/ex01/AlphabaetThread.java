package com.javaex.thread.ex01;

public class AlphabaetThread extends Thread {

	@Override
	public void run() {
		for(char ch ='a'; ch<= 'z'; ch++) {
			System.out.println(ch);
			
			//출력속도 지연
			try {
				Thread.sleep(300);
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}

	
}
