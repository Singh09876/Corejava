package com.rays.abstract1;

public class TestShape {
	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		r.hello();
		r.area();
		
		Shape s=new Rectangle();
		s.hello();
		Shape.hello();
	
	}

}
