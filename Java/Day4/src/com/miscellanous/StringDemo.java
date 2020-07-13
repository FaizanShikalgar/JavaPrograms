package com.miscellanous;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s = "abc";
		System.out.println(s.hashCode());
		
		String s1 = s;
		System.out.println(s.hashCode());
		
		String str = new String("Manasi");
		
		System.out.println(str.hashCode());
		
		//Important Methods about the String Class
		
		String x = "airplane";
		System.out.println(x.charAt(2));
		
		x = "taxi";
	System.out.println(x.hashCode());
	System.out.println(x.concat("cab"));
	System.out.println(x);
		System.out.println(x.hashCode());
		
		//use the + and += (Overloaded Operators to perform same operations
		x = "library";
		System.out.println(x +" Card");
		
		x = "Aritlantic";
		x+=" ocean";
		System.out.println(x);
		
	     x ="Exit";
		System.out.println(x.equalsIgnoreCase("EXIT"));
		System.out.println(x.equalsIgnoreCase("tixe"));
		
		x = "01234567";
		System.out.println(x.length());
		
		x = "oxoxoxox";
		System.out.println(x.replace('x', 'X'));
		
		x = "0123456789";
		System.out.println(x.substring(5));
		System.out.println(x.substring(5,8));
		
		x ="A New Moon";
		System.out.println(x.toLowerCase());
		
		x = "A New Moon";
		System.out.println(x.toUpperCase());
		
		x = "Big Surprise";
		System.out.println(x.toString());
		
		x ="        hi      ";
		System.out.println(x.hashCode());
		System.out.println(x+"x");
		String x1 = x.trim();
		System.out.println(x1.hashCode());
		System.out.println(x1 + "x");

	}
}
