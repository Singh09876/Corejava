package com.rays.Threads;

public class TestWithThreads {
	public static void main(String[] args) {
		
		WithThreads t1 =new WithThreads ("aryan");
		
		WithThreads t2 =new WithThreads ("yash");
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
