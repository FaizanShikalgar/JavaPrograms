package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

     List myList = new ArrayList();
     myList.add(12);
     myList.add(34.09);
     myList.add(true);
     
     List<Integer> intList = new ArrayList<Integer>();
     intList.add(12);
     intList.add(20);
     intList.add(22);
     intList.add(122);
     intList.add(23);
     
     System.out.println("List Data:"+intList);

     
     List<Integer> ival = new ArrayList<Integer>();
     ival.addAll(intList);
     ival.add(34);
     ival.add(8);
     
     System.out.println("Using for each");
     for(Integer i:ival) {
    	 System.out.println(i);
     }
     
     ival.add(-23);
     
     System.out.println("Using iterator");
     Iterator<Integer> itr = ival.iterator();
     while(itr.hasNext()) {
    	 Integer i = itr.next();
    	 if(i<0) {
    		 itr.remove();
    	 }
    	 System.out.println(i);
     }
     System.out.println(ival); 
     
     System.out.println("Is 2 is the part of List ?"+ival.contains(2));
     System.out.println("Size of the List:"+ival.size());
	}
	

}
