package com.rays.Threads;

public class WithThreads extends Thread{

	String name =null;
	public WithThreads( String name) {
		this.name=name;
	}
	public void run() {
	for (int i = 1; i<=10; i++) {
		System.out.println(i+"  "+name);
		
	}	
	}
	
	
}
