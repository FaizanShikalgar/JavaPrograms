package com.gen;

public class GeneralClass {
	
	Object obj;
	
	public GeneralClass(Object obj){
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "GeneralClass [obj=" + obj + "]";
	}


	public static void main(String[] args) {

         GeneralClass g = new GeneralClass("Hi");
         String str = (String) g.getObj();
         
         GeneralClass g1 = new GeneralClass(100);
         Integer i = (Integer) g1.getObj();
         
         g = g1;
         if(g.obj instanceof String)
             str = (String) g.getObj();
	}  

}
