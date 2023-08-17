package com.rays.super_this;

public class Shape {
private  String color =null; 
	private int BorderWidth = 0;
	
	public Shape() {

	}
	
	public Shape(String color,int borderWidth) {
		this();
		this.color = color;
		this.BorderWidth = borderWidth;
	}
	
	public void setBorderWidth(int borderWidth) {
		BorderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return BorderWidth;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public double area() {
		System.out.println("Shape area method..!!");
		return 0;
	}

}

