package com.inner;
class MyOuter2
{
	private String x = "Outer2";
	public void dostuff()	
	{
		 String z ="local variable";
		class MyInner1
		{
			public void seeOuter()
			{
				
				System.out.println("Outer x:"+x);
				System.out.println("Local Variable Z is"+z);
			}
		}
		MyInner1 m1 = new MyInner1();
		m1.seeOuter();
	}
}
public class MethodLocInnerDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyOuter2 outer = new MyOuter2();
		outer.dostuff();

	}

}
