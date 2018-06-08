package com.javaex.io.bytestream0523;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArratStreamEx {

	public static void main(String[] args) {
		// input source
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		// output target
		byte[] outSrc = null;
		
		//인풋소스를 확인
		System.out.println(Arrays.toString(inSrc));
		
		// 인풋 스트림과 아웃풋 스트림을 열어 보겟습니다.
		
		try {
			// 인풋스트림열기
			InputStream bis = new ByteArrayInputStream(inSrc);
			// 아웃풋스트림
			OutputStream bos = new ByteArrayOutputStream();
			int data = 0; // 인풋 스트림으로부터 넣어오는 데이터 저장
			
			while((data = bis.read()) != -1) {
				System.out.println("Read Data: "+data);
				bos.write(data);//data값 출력
			}
			
			outSrc =((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(outSrc); // 아웃소스 결과 확인
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO 예외는 이곳에서 처리
		}catch (Exception e) {
			// 위에서 처리되지 않은 예외는 이곳에서 처리
		}
	}

}
