package com.test;
import java.util.Date;

import com.emp.Employee;
import com.util.Address;


public class TestContainment {

	public static void main(String[] args) {

     Address ad = new Address("Pune", "Maha", "India");
     
     Employee emp = new Employee(12, "Manasi",76000,ad);
     emp.display();
     
     
     emp = null;
     
     
     Employee e1 =
    		 new Employee(13,"Sam",12000,new Address("Nashik","Maha","India"));
     e1.display();
     
     java.util.Date d1 = new Date();
     System.out.println(d1);
     
	}

}
