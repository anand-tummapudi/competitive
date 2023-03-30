package com.thread.sync;

public class Sender {
	
	public synchronized void send(String msg) {
		
		System.out.println("Sending ..."+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(msg+"... Sent");
	}

}
