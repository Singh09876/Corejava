package com.rays.noncons_extends;

public class Rectangle extends Shape {
	private int lenght=0;
	private int width=0;
	   
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getLenght() {
		return lenght;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}public  double area() {
		int  rArea=getLenght()*getWidth();
		System.out.println( " child rectangle area "+rArea);
		return 0;
	}

}
