package com.rays.noncons_extends;

public class Shape {
	private String color=null;
	private int borderWidth=0;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
public void setBorderWidth(int borderWidth) {
	this.borderWidth = borderWidth;
}
public int getBorderWidth() {
	return borderWidth;
}
public  double area() {
	System.out.println( " parent shape area method...!!!1!!!");
	return 0;
}
}
