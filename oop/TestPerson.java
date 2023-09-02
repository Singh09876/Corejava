package com.rays.oop;



import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TestPerson {
public static void main(String[] args) throws ParseException {
	Person p=new Person();
	String str ="15/09/2002";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     
     p.setId(10);
     p.setDob(sdf.parse(str));
     p.setAddress("indore");
	System.out.println(p.getId());
	System.out.println(p.getDob());
	System.out.println(p.getAddress());

	
	
	}
}
