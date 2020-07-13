package com.emp;
import com.objectimpl.MyDate;

public abstract class Employee {
	
	private int empId;
	private String empName;
	private MyDate jonDate; // add as reference to employee
	
	 public abstract int calSal();
	public Employee() {
		empId = 101;
	    empName = "Sam";
	    jonDate = new MyDate();
	    
	   
	}
	public Employee(int empId,String empName,MyDate joinDate) {
		this.empId = empId;
		this.empName = empName;
		this.jonDate = joinDate;
	}
	
	public void setEmployee(int empId,String empName,MyDate joinDate) {
		this.empId = empId;
		this.empName = empName;
		this.jonDate = joinDate;
		
	}
	 public void display() {
		System.out.print("Employee Id:"+empId+"\nEmployee Name:"+empName+"\n Join");
		jonDate.displayDate();
	}
	 
	public String toString() {
		return "Employee Id:"+empId+"\nEmployee Name:"+empName+
				"\nJoinDate:"+jonDate;
	}
	

}