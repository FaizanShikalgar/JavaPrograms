package com.exe;

public class TestClone {

	public static void main(String[] args) {

     /* MyDate d1 = new MyDate(8,"Jan",2010);
      System.out.println("Hash Code of d1:"+d1.hashCode());
      MyDate copyCat = d1.clone();
      System.out.println("Hash Code of copy :"+copyCat.hashCode());*/
     try {
      Employee emp = new Employee(1,"Sam",new MyDate(2,"Feb",2019));
      System.out.println("Employee object hashcode:"
      +emp.hashCode());
      System.out.println("Join Date hashcode:"
      +emp.jonDate.hashCode());
      
      
      Employee temp = emp.clone();
      System.out.println("Employee object hashcode:"
      +temp.hashCode());
      System.out.println("Join Date hashcode:"
      +temp.jonDate.hashCode());
	 }
     catch(CloneNotSupportedException ex) {
    	 ex.printStackTrace();
     }
	}   

}
