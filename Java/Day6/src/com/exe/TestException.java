package com.exe;

public class TestException {
	
	public static void main(String args[]) {
		
		double res = 0;
		try {
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		String op = args[2];
		
		 res = no1/no2;
		
	}
	catch(ArithmeticException ex) {
		ex.printStackTrace();
		//System.exit(0);
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Insufficent no of arguments:"+ex.getMessage());
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
	finally {
		System.out.println("Result is:"+res);
	}
		
	System.out.println("Lets Start next execution");	
	}		

}
