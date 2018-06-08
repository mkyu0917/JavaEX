package com.javaex.network.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddressEx {

	public static void main(String[] args) {
		
		
			try {
				InetAddress local = InetAddress.getLocalHost();
				System.out.println("IP Address:" +local.getHostAddress());
				
				String hostName = "www.naver.com";
				//www.google.com의 서버아이피를 받아보자
				InetAddress[] adrs = InetAddress.getAllByName(hostName);
				for(InetAddress remote:adrs) {
					System.out.println("www.google.com IP Address: " + remote.getHostAddress());
				}
			
			
			}catch(UnknownHostException e) {
				e.printStackTrace();
			}
	}

}
