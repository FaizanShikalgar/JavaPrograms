package com.inner;
//this is the demo of Argument Defined Anonymous Inner Classes Flavor I 
public class MAAICOuter 
{
      public void Show(Employee e)
      {
    	  e.display();
      }
      
	
	public static void main(String[] args) 
	{
		MAAICOuter o = new MAAICOuter();
		o.Show(new Employee(){
			private double salary;
			{
				salary = 30000.00;
				
			}
			public void display()
			{
				super.display();
				System.out.println("Salary:"+salary);
			}
		});

	}

}
