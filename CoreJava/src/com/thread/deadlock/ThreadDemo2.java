package com.thread.deadlock;

public class ThreadDemo2 extends Thread{
	
	MessageSender sender;
	MessageReceiver receiver;
	
	public ThreadDemo2(MessageSender sender, MessageReceiver receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public void run() {
		
		synchronized (sender) {
			
			System.out.println("Holding lock on Receiver ..Thread2");
			
			try{
				Thread.sleep(10000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		synchronized (receiver) {
			System.out.println("Holding Lock on Sender ...Thread2");
		}
	}

}
