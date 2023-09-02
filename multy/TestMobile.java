package com.rays.multy;

public class TestMobile {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Laptop l=new Laptop();
		Keypade k=new Keypade();
		
		Mobile m1=new Laptop();
		m1.setApk("insta");
		Laptop l1=(Laptop)m1;
		System.out.println(l1.getApk());
		
		
		Laptop p1=new Keypade();
		p1.setApk("instagram");
		Keypade k1=(Keypade)p1;
		System.out.println(k1.getApk());
		
		
		
	}

}
