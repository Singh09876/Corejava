package com.rays.noncons_extends;

public class Circle extends Shape{
	private int radius=0;
	public static final double PI=3.14;
	
	
	public void setRadius(int redius) {
		this.radius = redius;
	} 
	public int getRadius() {
		return radius;
	}
	public  double area() {
		double cArea=PI*radius*radius;
		System.out.println("circle area="+cArea);
		return cArea;
	}
	
				
		
		
	


}
