package com.rays.Deepcloning;

public class Account implements Cloneable{
	int balance=0;
Object o=100;
	public Account() {
	}
	public Account(int balance) {
		this.balance=balance;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
