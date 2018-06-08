package com.javaex.io.bytestream0523;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "C:\\Users\\김민규\\files\\files";
	static String filename = dirName + "\\primitives.txt";
	
	public static void main(String[] args) {
		
		// 스트림을 열어봅시다.
		
		try {
			OutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(40);
			dos.writeFloat(99.9f);
			
			dos.close();
			
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
					for( int i=0; i<2; i++) {
						// 주의 출력한 순서에 맞게 읽어와야함
						String s = dis.readUTF();
						boolean b = dis.readBoolean();
						int val  = dis.readInt();
						float f = dis.readFloat();
						
						double d = dis.readDouble();
						
						System.out.printf("%s : %b : %d : %f%n",s ,b,val,f);
								
					}
					 dis.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
		}

	}

}
