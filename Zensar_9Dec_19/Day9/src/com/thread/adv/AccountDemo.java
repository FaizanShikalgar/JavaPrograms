package com.thread.adv;
class AccountDemo 
{
	public static void main(String[] args)  throws Exception
	{
		Account jointaccount = new Account(1,10000);
		AccountUser shahrukh = 
				new AccountUser("Shahrukh",jointaccount,"deposite",3000);
		AccountUser gauri =
				new AccountUser("Gauri",jointaccount,"withdraw",7000);
		System.out.println("before transaction balance is  :"
		+jointaccount.balance);
		System.out.println("***********************************************");
		gauri.start();
		shahrukh.start();
	    //gauri.join();
	//shahrukh.join();
		System.out.println("***********************************************");
		
	}
}






