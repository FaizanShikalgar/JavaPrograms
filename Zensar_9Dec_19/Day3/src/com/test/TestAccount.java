package com.test;
import com.account.Account;
import static com.account.Account.getInterestRate;
public class TestAccount {
	
	public static void display(Account acc) {
		System.out.println("Account Detials:");
		acc.display();
		System.out.println("Interest:"+acc.calInterest(1));
	}

	public static void main(String[] args) {
    
     System.out.println("Interest Rate:"+getInterestRate());
     
     Account acc = new Account(1254,"Manasi",58236f);
     System.out.println("Interest:"+acc.calInterest(5));
     
     display(acc);
	}

}