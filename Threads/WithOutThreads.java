package com.rays.Threads;

public class WithOutThreads {

	String name =null;
	public WithOutThreads( String name) {
		this.name=name;
	}
	public void run() {
	for (int i = 1; i<=5; i++) {
		System.out.println(i+"  "+name);
		
	}	
	}
	
	
	
}