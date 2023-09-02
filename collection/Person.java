package com.rays.collection;

public class Person {

	private int id = 0;
	private String name = null;
	private String address = null;
	
	public Person(int id,String name,String address) {

		this.id = id;
		this.name = name;
		this.address = address;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return id + "\t"+name+ "\t"+address;
	}
	
}
