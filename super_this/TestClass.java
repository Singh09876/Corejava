package com.rays.super_this;

public class TestClass {

	public static void main(String[] args) {
		
		Shape s = new Shape("Blue",32);
		Rectangle r = new Rectangle(10,12);
		
		System.out.println(r.area());
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
			
	}
	
}
