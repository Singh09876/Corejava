package com.rays.exception;

public class Try_catch {
	public static void main(String[] args) {
		
		int a =10;
		int  b = 4;//give 0 here to creat a exception
			System.out.println("ask me");
			try {
				float c =a/b;
			
			System.out.println("divv is ="+c);
	}catch  ( Exception e) {
//		System.out.println(e);
		//System.out.println(e.getMessage());
		e.printStackTrace();
	}finally {
		
		
		System.out.println("solved");}
	}

}
