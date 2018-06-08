package com.javaex.io.bytestream0523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
		static String dirName = "C:\\Users\\김민규\\files\\files";
		static String source = dirName + "\\last-leaf.txt";
		static String target = dirName + "\\last-leaf-filtered.txt";
		
		public static void main(String[] args) {
			try {
				Reader fr = new FileReader(source);
				Writer fw = new FileWriter(target);
				
				//���� ��Ʈ���� ���ڽ��ϴ�.
				
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter wr = new BufferedWriter(fw);
				
				String line = ""; // �����͸� �о�ö���
				while((line = br.readLine()) != null) {
					if(line.toLowerCase().contains("leaf")||line.toLowerCase().contains("leaves")) {
						//leaf, leaves �� �ִ� ���θ�
						wr.write(line);
						wr.write("\r\n");
					}
					
					br.close();
					wr.close();
				}
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				
			}
			System.out.println("");	
		}
}
