package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ScannerEx {
	static String dirName = "C:\\Users\\±è¹Î±Ô\\files\\files\\";
	static String fileName =dirName+"thieves1.txt";
	public static void main(String[] args) {
		
		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				System.out.printf(" %s , Å°: %f , Ã¼Áß: %f%n", name ,height, weight);
				
				scanner.nextLine();
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace(); 
				
		}
	}

}
