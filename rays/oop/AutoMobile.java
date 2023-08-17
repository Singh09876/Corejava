package com.rays.oop;

public class AutoMobile {
	private String color=null;
	private int speed=0;
	private String make=null;
	public AutoMobile() {
		
	}public AutoMobile(String color,int speed ,String make) {
		this.color=color;
		this.speed=speed;
		this.make=make;
		}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public String getMake() {
		return make;
	}
}
