package com.rays.exception;

public class TestLogin_exception {
	public static void main(String[] args) {
		String name ="admi";
		if (name.contentEquals("admin")) {
			System.out.println("valid users ...!!!");
			
		}else {Login_exception e=new Login_exception();
		try {throw e;
		
		}catch(Login_exception e1) {
			System.out.println(e1);
		}finally {
				
		
		System.out.println("after if else....\n..work in progress");
	}
		}

	}}
