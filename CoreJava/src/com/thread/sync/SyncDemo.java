package com.thread.sync;

public class SyncDemo {

	public static void main(String[] args) {
		
		Sender sender = new Sender();
		ThreadedSend s1 = new ThreadedSend("Hi", sender);
		ThreadedSend s2 = new ThreadedSend("Bye", sender);
		ThreadedSend s3 = new ThreadedSend("Hello", sender);
		
		s1.start();
		s2.start();
		s3.start();
		try {
			s1.join();
			s2.join();
			s3.join();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
