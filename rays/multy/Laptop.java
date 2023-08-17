package com.rays.multy;

public class Laptop extends Mobile{
	private int software=0;
	private int hardware=0;
	
	public void setApk(int software) {
		this.software=software;}
		public int getSoftware() {
			return software ;}
		public void setRam(int hardware) {
			this.hardware=hardware;
		}
		public int getHardware() {
			return hardware;
		}

}
