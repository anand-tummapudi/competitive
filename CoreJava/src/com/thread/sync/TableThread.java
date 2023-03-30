package com.thread.sync;

public class TableThread extends Thread{
	Table table;
	int num;
	TableThread(Table table,int num){
		this.table = table;
		this.num = num;
	}
	
	public void run() {
		try{
			table.printTable(num);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
