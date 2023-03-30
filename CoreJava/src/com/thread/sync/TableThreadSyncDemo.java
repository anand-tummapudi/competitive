package com.thread.sync;

public class TableThreadSyncDemo {

	public static void main(String[] args) {
		Table table = new Table();
		TableThread t1 = new TableThread(table, 5);
		TableThread t2 = new TableThread(table, 4);
		
		try {
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
