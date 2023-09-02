package com.rays.Threads;

public class TestByRunnable {
	
	
	public static void main(String[] args) {
		Thread t1 =new Thread(new ByRunnable("aryan"));
		Thread t2 =new Thread(new ByRunnable("yash"));
		
		t1.start();
		t2.start();
		
		
		
	}

}
