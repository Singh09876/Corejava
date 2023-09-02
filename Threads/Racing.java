package com.rays.Threads;

public class Racing extends Thread {
	String name =null;
	 static Account account=new Account();
public Racing(String name ) {
this.name=name;

}@Override
public void run() {
	for (int i = 1; i <=20; i++) {
		this.account.deposit(name, 1000);
		
	}
}
	
	
	
}
