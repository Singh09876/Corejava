package com.rays.oop;

public class Shape {
	private String color= null;
	private int borderWidth=0;
	
	public Shape (String c ,int bw) {
		color=c;
		borderWidth=bw;
}
	public void setColor(String c) {
		color=c;
	}
	public String getColor() {
		return color;
	}
	public void setBorderWidth(int bw) {
		borderWidth=bw;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	}


