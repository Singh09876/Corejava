package com.rays.exception;

public class exception_class {
public static void main(String[] args) {
	int  a=10;
	int b = 2;
	String name="aryan_singh";
	System.out.println("1");
	try {
	int c ;
	c=a/b;
	System.out.println(name.length());
	System.out.println(name.charAt(7));}
	catch(StringIndexOutOfBoundsException e) 
	{System.out.println(e);
	}catch(NullPointerException e) {
		System.out.println(e);
		}
	catch(ArithmeticException e) 
	{System.out.println(e);
	}catch (Exception e) {System.out.println(e);}
	System.out.println("23");
	}
}
