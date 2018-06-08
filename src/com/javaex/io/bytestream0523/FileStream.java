package com.javaex.io.bytestream0523;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {
	
		static String dirName = "C:\\Users\\��α�\\files\\files";
		static String source = dirName + "\\sangbuk.txt";
		static String target = dirName + "\\sangbuk_copy.txt";
						
	public static void main(String[] args) {
		try {
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(target);
		
		int data = 0;
		
		while((data = is.read()) != -1) {
			os.write(data);
		}
		
		os.close();
		is.close();
		
		System.out.println("������ �����߾��.");
		
		
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����");
		}catch (IOException e) {
			System.out.println("IOException");
		}
		
	
	
	}

}
