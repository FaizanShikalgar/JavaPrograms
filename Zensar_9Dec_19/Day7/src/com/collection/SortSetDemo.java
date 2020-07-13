package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class SortSetDemo {

	public static void main(String[] args) {

     Set<MyDate> dateSet = new TreeSet<>();
     dateSet.add(new MyDate(4,"Feb",2017));
     dateSet.add(new MyDate(7,"Dec",2017));
     dateSet.add(new MyDate());
     System.out.println(dateSet);
     

	}

}
