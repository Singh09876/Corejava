package com.rays.oop;

import java.util.Date;

public class Person {
	private int id= 0;
	private Date dob= null ;
	private String address=null;
	public Person() {
		
	}
	public Person (int id ,Date dob,String address) {
		this.id=id;
		this.dob=dob;
		this.address=address;
}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setDob(Date date) {
		this.dob=date;
	}
	public Date getDob() {
		return dob;
	} 
	public void setAddress(String address) {
		this.address=address;}
		public String getAddress() {
			return address;
		}

	


}
