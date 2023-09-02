package com.rays.practice;

public class Month {
	public static void main(String[] args) {
		int n=12;
		if(n==1||n==3||n==5||n==7||n==8||n==10||n==12) {
			System.out.println("days 31");
		}
		else if (n==2) {
			System.out.println("days 28");
			
		}
		else if (n==4||n==6||n==9||n==11) {
			System.out.println("days 30");
		}
	}

}
