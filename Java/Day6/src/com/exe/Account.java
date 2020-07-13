package com.exe;

public class Account {
	String accountId;
	String accholderName;
	double bal;
	public Account() {
		accountId= "00000124632";
		accholderName="Jon";
		bal = 10000;
	}
	public Account(String accountId,String accholderName,double bal) {
		this.accountId = accountId;
		this.accholderName = accholderName;
		this.bal = bal;
	}
	public String toString() {
		return "Account Id:"+accountId+"\nAccount Name:"+accholderName+"\nBal:"+bal;
	}
	public void withdraw(double amt) {
		double cbal;
		try {
		cbal = bal-amt;
		if(cbal<5000) {
			throw new InvalidBalException("Balace Should be > 5000");
		}
		else {
			bal = cbal;
		}
	  }
	  catch(InvalidBalException ex)
      {
		System.out.println(ex.getMessage());
		}
	}	
		
	

}
