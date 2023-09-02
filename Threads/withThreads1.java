package com.rays.Threads;

public class withThreads1 extends Thread {
	String name =null;
	public withThreads1( String name) {
		this.name=name;
	}
	public void run() {
	for (int i = 1; i<=10; i++) {
		System.out.println(i+"  "+name);
		
	}	
	}

}
