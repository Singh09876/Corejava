package com.rays.collection;

public class TestPerson {

	public static void main(String[] args) {
//		
//		String name1 ="Aryan";
//		String name2 = "Aryan";
//		String name3 = new String("Aryan");
//		
//		System.out.println(name1.equals(name3));
//		
//		System.out.println(name1==(name3));
	
		Person p1 = new Person(1, "aryan","rajwada");
		
		Person p2= new Person(1, "aryan","rajwada");

		System.out.println(p1.equals(p2));
	}
	
}
