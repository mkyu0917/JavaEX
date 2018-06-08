package com.javaex.io.bytestream0523;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {
	
		static String dirName = "C:\\Users\\김민규\\files\\files";
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
		
		System.out.println("파일을 복사했어요.");
		
		
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요");
		}catch (IOException e) {
			System.out.println("IOException");
		}
		
	
	
	}

}
