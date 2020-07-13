package com.gen;

public class Gen<T> {

    T obj;
	
	public Gen(T obj){
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "GeneralClass [obj=" + obj + "]";
	}
	
	public static void main(String args[]) {
		
		Gen<String> gen = new Gen<String>("Hi!!!");
		String msg = gen.getObj();	
		
		Gen<Integer> gen1 = new Gen<>(23);
		Integer ival = gen1.getObj();
		
		TwoGen<String, Double> empdetail = new TwoGen<String, Double>("Manasi", 23456.0);
		empdetail.showTypes();
		String empName = empdetail.getob1();
		double sal = empdetail.getob2();
		
 	}
}
