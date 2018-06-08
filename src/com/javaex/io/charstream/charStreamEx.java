package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class charStreamEx {
	static String dirName = "C:\\Users\\김민규\\files\\files";
	static String fileName =dirName+"\\char.txt";

	public static void main(String[] args) {
		
		// ���� �����͸� ���ڽ��ϴ�.
		try {
			Writer fwriter = new FileWriter(fileName);
			fwriter.write("Bit Computer\n");
			fwriter.write("Java Programming\n");
			fwriter.write("2018.05");
			fwriter.flush();
			fwriter.close();
			
			// File reader ���ڽ��ϴ�.
			Reader freader = new FileReader(fileName);
			
			int data = 0;
			while((data = freader.read()) != -1) {
				System.out.println((char)data);
				
			}
			System.out.println();
			freader.close();
			
			
		}catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����");
		}catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
