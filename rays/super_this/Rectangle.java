package com.rays.super_this;

public class Rectangle extends Shape{

	private int length;
	private int width;
	
	public Rectangle() {

	}
	public Rectangle(int length,int width) {
		super("Green",100);
		this.length = length;
		this.width = width;
	}
	public Rectangle(int length,int width,String color,int borderWidth) {
		super(color,borderWidth);
		this.length = length;
		this.width = width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	@Override
	public double area() {
		int rArea = getLength()*getWidth();
	System.out.println("Rectangle area = " +rArea);
	return rArea;
	}
	
}
