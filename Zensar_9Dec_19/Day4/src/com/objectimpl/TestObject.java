package com.objectimpl;

import com.sales.SalesPerson;

public class TestObject {

	public static void main(String[] args) {
     int i = 10;
     System.out.println(i);
     
     MyDate d1 = new MyDate();
     System.out.println(d1);// Object class toString()
     System.out.println(d1.hashCode());
     
     MyDate d2 = new MyDate(8,"Jan",2091);
     System.out.println(d2.hashCode());
     
      MyDate temp = d1;
     System.out.println(temp.hashCode());
     
     SalesPerson sp = new SalesPerson();
     
     if(d1.equals(sp)) {
    	 System.out.println("Objects are same");
     }
     else {
    	 System.out.println("Objects are not same");
     }
	}

}
