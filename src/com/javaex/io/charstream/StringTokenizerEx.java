package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	
	static String dirName = "C:\\Users\\김민규\\files\\files";
	static String fileName= dirName+ "\\thieves1.txt";
	
	public static void main(String[] args) {
		
		// ��Ʈ�� ����ô�.
	try {
		Reader freader = new FileReader(fileName);
		BufferedReader br= new BufferedReader(freader);
		
		String thief;
		
		while((thief = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(thief, " ");
			while (st.hasMoreElements()) {
				String token = st.nextToken();
				System.out.println(token + " ");
			}
		System.out.println();
		}
	
	}catch (FileNotFoundException e) {
		e.printStackTrace();
		
	}catch (IOException e) {
		
	}


	}}
