package com.inner;
//this is Method Local Anonymous Inner Class Flavor I

class Employee
{
	private int empId;
	private String name;
	Employee()
	{
		empId = 1000;
		name = "ABC";
		System.out.println("Defeult Constructor get called");
	}
	Employee(int empId,String name)
	{
		this.empId = empId;
		this.name = name;
		
		System.out.println("Parameterized Constructor Get Called");
	}
	public void display()
	{
		System.out.println("EmpId:"+empId+"\t Name"+name);
		
	}
}
public class MethodAnonInnerDemo {
	public void Show()
	{
		Employee e = new Employee()
		{
			private double salary;
			{
				salary = 20000;
			}
			public void display()
			{
				super.display();
				System.out.println("Salary:"+salary);
			}
		};
		e.display();
	}
	public static void main(String[] args) 
	{
		MethodAnonInnerDemo o = new MethodAnonInnerDemo();
		o.Show();

	}

}
