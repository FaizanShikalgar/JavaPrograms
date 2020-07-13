package com.test;

import com.emp.Developer;
import com.iface.Printable;
import com.objectimpl.MyDate;
import com.util.Address;

public class TestInterface {

	public static void main(String[] args) {
	
		Address add = new Address();
		add.print();
		
		Printable p = new Developer();
		p.print();
		
		
		p = add;
		
		
		//p = new MyDate();
	}

}
