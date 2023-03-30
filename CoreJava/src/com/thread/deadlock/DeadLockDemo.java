package com.thread.deadlock;

public class DeadLockDemo {

	public static void main(String[] args) {
		
		MessageSender sender = new MessageSender();
		MessageReceiver receiver = new MessageReceiver();
		
		ThreadDemo1 demo1 = new ThreadDemo1(sender, receiver);
		ThreadDemo2 demo2 = new ThreadDemo2(sender, receiver);
		
		try {
			demo1.start();
			demo2.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
