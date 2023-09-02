package com.rays.core_java_8;

public class TestByAnnonymous {
	public static void main(String[] args) {
		Hello h=new Hello() {
			
			@Override
			public void say(int a ) {
				System.out.println(a+"  "+"functional interface by annonymous function...!!!");
				
			}
		};
		h.say(10);
	}

}
