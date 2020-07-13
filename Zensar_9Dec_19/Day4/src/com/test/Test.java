package com.test;
import com.emp.Developer;
import com.emp.Employee;
import com.emp.WageEmployee;
import com.objectimpl.MyDate;
import com.sales.SalesPerson;

public class Test {
	
     public static void showData(Employee []e) {
    	 for(Employee emp:e) {
    		 emp.display();
    		 System.out.println("Salary:"+emp.calSal());
    		 if(emp instanceof SalesPerson)
    		    System.out.println("Incentive is:"+((SalesPerson)emp).calIncentive());
    		 else if(emp instanceof Developer)
    			System.out.println("Incentive is:"+((Developer)emp).cal_Incentive());
    		    
    		 System.out.println("___________________________________");
    		 }
    	
     }

	public static void main(String[] args) {

     /*Employee emp = 
    		 new Employee(12, "Sam", new MyDate(2, "Feb", 2010));
     emp.display();*/
     
  /*
  WageEmployee we =  new WageEmployee();
     we.display();
     System.out.println("Salary is:"+we.calSal());
     
     WageEmployee wemp = 
    new WageEmployee(1,"Manasi",new MyDate(3,"Feb", 2007),80,1000);
     wemp.display();
     System.out.println("Salary is:"+wemp.calSal());
     
     SalesPerson sp = new SalesPerson(1,"Neha",new MyDate(4,"Dec", 2018),175,1000,80000);
     sp.display();
     System.out.println("Salary is:"+sp.calSal());
     System.out.println("Incentive:"+sp.calIncentive());
     
     Employee emp1 = new WageEmployee();
     System.out.println("Salary is:"+emp1.calSal());*/
		
		Employee e1[] = new Employee[3];
		e1[0] = new WageEmployee(1,"Manasi",new MyDate(3,"Feb", 2007),80,1000);
		e1[1] = new SalesPerson(19,"Neha",new MyDate(4,"Dec", 2018),175,1000,80000);
		e1[2] = new Developer(10, "Sam",new MyDate(3, "Nov", 2010),"PayRole","Sr.dev",67);
        
		showData(e1);
     
     
     
	}

}
