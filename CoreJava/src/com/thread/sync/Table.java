package com.thread.sync;

public class Table {
	
	public synchronized void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" *"+i+" ="+(num*i));
		}
	}

}
