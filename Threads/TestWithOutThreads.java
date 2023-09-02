package com.rays.Threads;

public class TestWithOutThreads {

	public static void main(String[] args) {
		
		WithOutThreads t1 =new WithOutThreads("aryan");
		
		WithOutThreads t2 =new WithOutThreads("mahi");
		t1.run();
		t2.run();
		
		
	}
}
