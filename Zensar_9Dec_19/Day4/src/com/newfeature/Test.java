package com.newfeature;

public class Test {

	public static void main(String[] args) {
		
		MyClass c1 =new MyClass();
		c1.method1("Manasi");
		c1.log("Manju");
		
		Interface1 face1 = new MyClass();
		face1.method1("Java 8 Features");
		//Calling the overriden  method from the MyClass
		face1.log("Interface Use");
		
		Interface2 face2 = c1;
		face2.method2();
		//Calling the overriden  method from the MyClass
		face2.log("Java 8 Interce use ");
		
		

	}

}