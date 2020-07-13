package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		 List<Integer> intList = new ArrayList<Integer>();
	     intList.add(12);
	     intList.add(20);
	     intList.add(22);
	     intList.add(122);
	     intList.add(23);
	     
	     System.out.println("List Data:"+intList);
	     
	     Collections.sort(intList);
	     
	     System.out.println("Sorted List:"+intList);

	     List<Employee> empList = new ArrayList<Employee>();
	     empList.add(new Employee(1,"Manu",23000));
	     empList.add(new Employee(3,"Sam",23000));
	     empList.add(new Employee(4,"Tanu",230000));
	     empList.add(new Employee(56,"Sanu",239000));
	     for(Employee e:empList) {
	    	 System.out.println(e);
	     }
	     
	     Collections.sort(empList);
	     System.out.println("Sorted List:");
	     for(Employee e:empList) {
	    	 System.out.println(e);
	     }
	     
	     System.out.println("Sorting on the Name");
	     Collections.sort(empList, new EmpNameCompareImpl());
	     
	     System.out.println("Sorted List by Name:");
	     for(Employee e:empList) {
	    	 System.out.println(e);
	     }
	}
	

}
