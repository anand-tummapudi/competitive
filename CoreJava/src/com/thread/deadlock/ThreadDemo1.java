package com.thread.deadlock;

public class ThreadDemo1 extends Thread {
	
	/*
	 * public static Object lock1 = new Object(); public static Object lock2 = new
	 * Object();
	 */
	MessageSender sender; 
	MessageReceiver receiver;
	
	public ThreadDemo1(MessageSender sender, MessageReceiver receiver){
		this.sender = sender;
		this.receiver = receiver;
	}
	
	
	public void run() {
		
		synchronized(sender){
			System.out.println("Holding the Lock on Sender....Thread1");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		synchronized (receiver) {
			System.out.println("Holding the lock on Receiver .. Thread1");
			
		}
		
	}

}
