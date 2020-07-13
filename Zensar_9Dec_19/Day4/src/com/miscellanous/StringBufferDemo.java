package com.miscellanous;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb="+sb);
		sb.append(3.14159f);
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("java");
		sb1.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("test string");
		System.out.println(sb2.toString());

	}
}
