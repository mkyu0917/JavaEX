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
		
		//��ǲ�ҽ��� Ȯ��
		System.out.println(Arrays.toString(inSrc));
		
		// ��ǲ ��Ʈ���� �ƿ�ǲ ��Ʈ���� ���� ���ٽ��ϴ�.
		
		try {
			// ��ǲ��Ʈ������
			InputStream bis = new ByteArrayInputStream(inSrc);
			// �ƿ�ǲ��Ʈ��
			OutputStream bos = new ByteArrayOutputStream();
			int data = 0; // ��ǲ ��Ʈ�����κ��� �־���� ������ ����
			
			while((data = bis.read()) != -1) {
				System.out.println("Read Data: "+data);
				bos.write(data);//data�� ���
			}
			
			outSrc =((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(outSrc); // �ƿ��ҽ� ��� Ȯ��
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO ���ܴ� �̰����� ó��
		}catch (Exception e) {
			// ������ ó������ ���� ���ܴ� �̰����� ó��
		}
	}

}