package com.emp;

import com.iface.Printable;
import com.objectimpl.MyDate;

public class Developer extends Employee implements Printable{
	
	private String proName;
	private String desg;
	private int no_of_days;
	public Developer(int empId,String empName,MyDate joinDate,String proName, String desg, int no_of_days) {
		super(empId,empName,joinDate);
		this.proName = proName;
		this.desg = desg;
		this.no_of_days = no_of_days;
	}
	public Developer() {
		super();
		this.proName ="Sample Project";
		this.desg="Sr.Dev";
		this.no_of_days = 100;
	}
	
	public void display() {
		super.display();
		System.out.println("Project Name:"+proName);
		System.out.println("Desg:"+desg);
		System.out.println("No_Of_Days:"+no_of_days);
	}
	public int cal_Incentive() {
		int incentive = 0;
		switch(desg) {
		case "Sr.dev": incentive= 500 * no_of_days;
		               break;
		case "Jr.dev": incentive= 200 * no_of_days;
                       break; 
        default: System.out.println("Invalid desg:");
        
                       
		}
		return incentive;
			
			
	}
	@Override
	public int calSal() {
		// TODO Auto-generated method stub
		return 50000;
	}
	@Override
	public void print() {

       display();
       System.out.println("Salary of Developer:"+this.calSal());
       System.out.println("Calculate Incentive:"+this.cal_Incentive());
	}
	
	
	
	

}
