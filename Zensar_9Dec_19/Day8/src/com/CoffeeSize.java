package com;
enum CoffeeSize 
{
     BIG(8),
     HUGE(10),
     OVERWHELMING(16);
      private int ounces;
     CoffeeSize(int ounces)
     {
    	 this.ounces = ounces;
    	 System.out.println("Inside the enum constructor");
     }
     public int getOunces()
     {
    	 return ounces;
     }
     public String getLidCode()
     {
    	   	 return "B";
     } 	 
     
}
