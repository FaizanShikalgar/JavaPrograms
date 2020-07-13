package com.miscellanous;

public class StringBuilderDemo {
	
	public static void main(String[] args) 
	{
	     StringBuilder sb = new StringBuilder("abc");
	     sb.append("def");
	     System.out.println(sb);
	     
	     StringBuilder sb1 = new StringBuilder("0123456789");
	     System.out.println(sb1.delete(4, 6));
	     
	     StringBuilder sb2 = new StringBuilder("0123456789");
	     System.out.println(sb2.insert(4, 6));
	     
	     StringBuffer s = new StringBuffer("abc");
	     s.append("def").reverse().insert(3, "----");
	     System.out.println(s);
	}


}
