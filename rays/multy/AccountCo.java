package com.rays.multy;

public class AccountCo {



		private int balance =0;
		public void setBalance(int balance) {
			this.balance=balance ;
		}
		public AccountCo(){
			
		}
	public int getBalance() {
		return balance ;
	}
	public void deposite(int  amt) {
		int total=getBalance()+amt;
		setBalance(total);
		System.out.println("balance after deposite "+ getBalance());
	}
	public void withdrawl(int  amt) {
		int total=getBalance()-amt;
		if (total<2000) {
			System.out.println("insufficient---Balance...!!!");
			
		}
		else {
			setBalance(total);
			System.out.println("Balance after withdrawl"+getBalance());
		}
		
	}

	}


