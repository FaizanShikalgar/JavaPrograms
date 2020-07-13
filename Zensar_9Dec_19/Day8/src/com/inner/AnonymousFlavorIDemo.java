package com.inner;
//this is Plain- Old Anonymous inner Class Flavor I
class Popcorn
{
	public void pop()
	{
		System.out.println("Popcorn");
	}
}
class Food
{
	Popcorn p = new Popcorn()
	{
		public void pop()
		{
			System.out.println("anonymous Popcorn");
		}
	};
	public void Display()
	{
		p.pop();
	}
}
public class AnonymousFlavorIDemo 
{
	public static void main(String args[])
	{
		Food f = new Food();
		f.Display();
		
		Popcorn p1 = new Popcorn();
		p1.pop();
	}

}
