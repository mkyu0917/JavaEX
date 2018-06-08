package com.javaex.network.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		// 서버 소캣을 생성한다.
		
		ServerSocket serverSocket = null;
		
		// 바인드과정
		try {
		serverSocket = new ServerSocket();
		InetSocketAddress local = new InetSocketAddress("127.0.0.1",10000 );
				serverSocket.bind(local);
			//시작메세지를 출력
				System.out.println("<서버시작>");
				System.out.println("[연결을 기다립니다]");
			//연결을 기다려봅니다. : 대기상태
			Socket socket = serverSocket.accept();
			
			//클라이언트 접속시 처리
			InetSocketAddress socketAddress = 
					(InetSocketAddress)socket.getRemoteSocketAddress();
		
			System.out.println("[클라이언트가 연결되었스빈다]");
			System.out.println(socket.getRemoteSocketAddress()+" : " +
						socketAddress.getPort());
			
			//클라이언트로부터 메세지를 받아 봅시다.
			//스트림을 열겠습니다.
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//메세지를 읽겠습니다.
			String msg;
			while(true) {
				
				msg = br.readLine();
				
				if(msg == null) {
					System.out.println("[접속 종료되었습니다.]");
					break;
				}
				System.out.println("Message:" + msg);
			}
			
			//후처리
			
			System.out.println("========");
			System.out.println("<서버종료>");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();//소켓코드 투롸이캐치
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}
