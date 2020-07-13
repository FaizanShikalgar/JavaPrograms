package com.inner;
//this is Method Local Anonymous Inner Class Flavor II
public class MethodAnonInnerDemo1 
{
   public void Show()
   {
	   Switchable sw = new Switchable()
	   {
		   public void SwitchOn()
		   {
			   System.out.println("Switch On");
		   }
		   public void SwitchOff()
		   {
			   System.out.println("Switch Off");
		   }
	   };
	   sw.SwitchOff();
	   sw.SwitchOn();
	   
   }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodAnonInnerDemo1  md = new MethodAnonInnerDemo1();
		md.Show();

	}

}
