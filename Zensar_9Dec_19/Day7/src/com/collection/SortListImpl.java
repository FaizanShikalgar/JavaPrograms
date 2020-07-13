package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortListImpl {

	public static void main(String[] args) {

      List<Employee> empList = new ArrayList<>();
      empList.add(new Employee(1001,"Pawan",85000));
      empList.add(new Employee(111,"Manish",40000));
      empList.add(new Employee(178,"Sam",45000));
      empList.add(new Employee(1041,"Jo",45000));
      empList.add(new Employee(101,"Manasi",45000));
      System.out.println("Employee Data");
      Iterator<Employee> empItr = empList.iterator();
      while(empItr.hasNext()) {
    	  System.out.println(empItr.next());
      }
        Collections.sort(empList);//Sort with Comparable
      
       System.out.println(empList);
      System.out.println("Sorting Employee on basics of Name");
      Collections.sort(empList,new EmpNameCompareImpl());
      System.out.println(empList);
	}

}
