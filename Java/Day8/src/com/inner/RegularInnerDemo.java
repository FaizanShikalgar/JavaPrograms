package com.inner;
class MyOuter
{
	private int x = 7;
	//inner class definition
	class MyInner
	{
		public void seeOuter()
		{
			System.out.println("Outer x is:"+x);
			//Referring the Inner class reference by this.
			System.out.println("Inner class ref is:"+this);
			//Referring the Outer  class reference form Inner Class
			System.out.println("Outer Class Reference is:"+MyOuter.this);
		}
	}	
		//You can create the instance of Inner class in this way also
	public void makeInner()
	{
			MyInner in = new MyInner();
			in.seeOuter();
	}
}
public class RegularInnerDemo {
	
	public static void main(String[] args) 
	{
        //create the instance of inner class
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner(); 

		inner.seeOuter();
		
		/*or you can say
		 * MyOuter.MyInner inner = new MyOuter().new MyInner();
		 */
		
		MyOuter mo1 = new MyOuter();
	    mo1.makeInner();	
	
		
	}

}
