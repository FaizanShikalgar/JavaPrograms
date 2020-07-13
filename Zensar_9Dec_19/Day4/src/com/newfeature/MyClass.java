package com.newfeature;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		System.out.println("Method from Interface 2");

	}

	@Override
	public void method1(String str) {
		System.out.println("Method from Interface 1 with the data:"+str);

	}
	/*In the interface1 and interface2 both 
	 * have the same the same name method log so now I required the override the log method(non-Javadoc)
	 * @see com.interfaceuse.Interface1#log(java.lang.String)
	 */
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		/*
		 * Print method is the static method and you 
		 * can give the call to the static method 
		 * by Interface name just like class
		 */
		
		Interface1.print("abc");
	}

}