package com.javaex.io.bytestream0523;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "C:\\Users\\��α�\\files\\files";
			
	public static void main(String[] args) {
		//���� ��ü
		File root = new File(dirName);
		
		//������ ���� �����ϴ��� Ȯ��
		System.out.println(dirName + ":" + root.exists());
		//������ ������ ���
		
		printInfo(root);
		
		// ���͸� ���ʿ� ������ ����� ���ô�.(��ü�� ���� ���������� ����� �ƴ�_)
		File file = new File(dirName +"\\myFile.txt");
		
		if(!file.exists()) { // ������ ������ ����
				try{
					file.createNewFile();
				}catch (IOException e) {
					System.out.println("������ ������ ���߾��");
				}
	
		}
		//��������� 
				file.delete();
				printInfo(root);
			}
		
	

	
		static void printInfo(File f) {
			System.out.println("-----------");
			
			// �� ���� ��ü�� ���丮���� Ȯ�� �� ���ô�.
			
			if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
				File[] files = f.listFiles();
				
				//���� ����Ʈ ���
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
