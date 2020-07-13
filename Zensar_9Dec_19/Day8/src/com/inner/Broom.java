package com.inner;
class BigOuter 
{
	static class Nest
	{
		void go()
		{
			System.out.println("Hi");
		}
	}
}
class Broom
{
	static class B2
	{
		void goB2()
		{
			System.out.println("Hi 2");
		}
	}
	public static void main(String[] args) 
	{
	   BigOuter.Nest n = new BigOuter.Nest();
        n.go();
		B2 b2 = new B2();
		b2.goB2();
	}
}
	

