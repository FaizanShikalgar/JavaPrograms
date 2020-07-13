package com.thread.adv;
class AccountUser extends Thread
{
	Account acc;
	String name,tot;
	float amt;
	AccountUser(String s,Account a,String typeOfTransaction,int amount)
	{
		super(s);
		acc=a;
		name=s;
		tot=typeOfTransaction;
		amt=amount;
	}
	public void run()
	{		
		synchronized (acc) {
			
		
			if(tot.equals("withdraw"))
			{
				acc.withdraw(amt);
			}
			if(tot.equals("deposite"))
			{
				acc.deposite(amt);
			}
		}
	}	
	
}