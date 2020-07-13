package com.newfeature;

public interface Interface2 {

	void method2();
	// Interface with the default method
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}
