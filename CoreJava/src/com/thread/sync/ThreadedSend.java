package com.thread.sync;

public class ThreadedSend extends Thread {
	
	private String msg;
	Sender sender;
	
	public ThreadedSend(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}
	
	public void run() {
		
			sender.send(msg);
	}
}
