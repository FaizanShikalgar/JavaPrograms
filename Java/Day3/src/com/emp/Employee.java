package com.emp;
import com.util.Address;

public class Employee {
	
	private int empId;
	private String empName;
	private double sal;
	private Address add; // add as reference to employee
	
	public Employee() {
		empId = 101;
	    empName = "Sam";
	    sal = 1000;
	    add = new Address();
	    System.out.println("non para constructor");
	}
	public Employee(int empId,String empName,double sal,Address add) {
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.add = add;
	}
	public Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void setEmployee(int eid,String ename,double s,Address add) {
		empId = eid;
		empName = ename;
		sal = s;
		this.add = add;
	}
	 public void display() {
		System.out.println("Employee Id:"+empId+"\nEmployee Name:"+empName+"\n salary:"+sal);
		add.displayAddress();
	}

}
