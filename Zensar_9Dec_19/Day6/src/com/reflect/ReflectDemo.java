package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {

	public static void main(String[] args) {
   
	//loading the class in memeory and getting class object
	 try {
		Class c = Class.forName("java.lang.Object");
		 Method[] methods = c.getMethods();
		 System.out.println("Method Info");
		 for(Method m:methods) {
			 System.out.println(m);
		 }
		System.out.println("Info about Constructors");
		Constructor[] constructors = c.getConstructors();
		for(Constructor ctr: constructors) {
			System.out.println(ctr);
		}
		 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}

}
