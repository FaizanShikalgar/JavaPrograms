package com.collection;

import java.util.Comparator;

public class EmpNameCompareImpl implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.eName.compareTo(o2.eName);
	}

	
}
