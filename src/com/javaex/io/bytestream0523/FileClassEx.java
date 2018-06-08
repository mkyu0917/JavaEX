package com.javaex.io.bytestream0523;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "C:\\Users\\김민규\\files\\files";
			
	public static void main(String[] args) {
		//파일 객체
		File root = new File(dirName);
		
		//파일이 실제 존재하는지 확인
		System.out.println(dirName + ":" + root.exists());
		//파일의 정볼르 출력
		
		printInfo(root);
		
		// 디렉터리 안쪽에 파일을 만들어 봅시다.(객체만 생성 물리적으로 만든건 아님_)
		File file = new File(dirName +"\\myFile.txt");
		
		if(!file.exists()) { // 파일이 없으면 생성
				try{
					file.createNewFile();
				}catch (IOException e) {
					System.out.println("파일을 만들지 못했어요");
				}
	
		}
		//파일지우기 
				file.delete();
				printInfo(root);
			}
		
	

	
		static void printInfo(File f) {
			System.out.println("-----------");
			
			// 이 파일 객체가 디렉토리인지 확인 해 봅시다.
			
			if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
				File[] files = f.listFiles();
				
				//파일 리스트 출력
				for(File file:files) {
					System.out.println(file.isDirectory() ? "d" : "f");
					System.out.println(file.getName());
				}
			}else {
				System.out.println("File : " + f.getName());
			}
			System.out.println("-----------------");

		}
}
