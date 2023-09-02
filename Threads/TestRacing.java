package com.rays.Threads;

public class TestRacing {
	public static void main(String[] args) {
		Racing t1  =new Racing("aryan");
		Racing t2  =new Racing("aarhu");
		t1.start();
		t2.start();
	
}

}
