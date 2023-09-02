package com.rays.core_java_8;

public class TestByLambdaExp {

	public static void main(String[] args) {
		Hello h =(int a)->{
			System.out.println(a+"by lambda expression");
		};h.say(10);
	}
}
