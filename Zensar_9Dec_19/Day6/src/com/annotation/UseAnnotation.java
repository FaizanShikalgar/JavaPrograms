package com.annotation;
//@DevInfo(devName="Manasi",desc="Class using annotation concept")
public class UseAnnotation {
	
	//@DevInfo(devName="Dev",desc="Variable storing the data info")
	private String msg;
	
	@DevInfo(devName="Manasi",desc="Method showing msg")
	public void show() {
		System.out.println("Message:"+msg);
	}

}