package com.collection;

public class Employee implements Comparable<Employee>{

	private int eId;
           String eName;
	private double sal;
	public Employee() {
		eId = 101;
		eName = "Sam";
		sal = 5000;
				
	}
	public Employee(int id,String name,double s) {
		eId = id;
		eName =name;
		sal = s;
	}
	public String toString() {
		return "Employee Id:"+eId+"\tEmployee Name:"+eName+"\tSalary:"+sal;
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("Inside compareTo of Employee");
		if(this.eId<o.eId) {
			return -1;
		}
		else if(this.eId >o.eId) {
			return 1;
		}
		else
		return 0;
	}
	
}
