package com.emp;

import com.objectimpl.MyDate;

public class WageEmployee extends Employee {

	protected int hrs;
	private int rate;
	
	public WageEmployee() {
		super();
		hrs = 0;
		rate = 0;
	}
	public WageEmployee(int empId,String empName,MyDate joinDate,
			int hrs,int rate) {
		super(empId,empName,joinDate);
		this.hrs = hrs;
		this.rate = rate;
	}
	public void display() {
		super.display();
		System.out.println("Hrs:"+hrs+"\nRate:"+rate);
	}
	public int calSal() {
		return hrs * rate;
	}
	public String toString() {
		return super.toString()+"\nhrs:"+hrs+"\nRate"+rate;
	}
}
