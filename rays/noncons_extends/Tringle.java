package com.rays.noncons_extends;

public class Tringle extends Shape{
	private int base=0;
	private int hight=0;
	
	public void setBase(int base) {
		this.base = base;
	}
public int getBase() {
	return base;
}
public void setHight(int hight) {
	this.hight = hight;
}
public int getHight() {
	return hight;}
	public double area () {
		int tArea=(getBase()*getHight())/2;
		System.out.println("tringle area ="+tArea);
		return tArea;
	
}
}
