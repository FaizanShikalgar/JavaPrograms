package com.collection;

public class MyDate implements Cloneable,Comparable<MyDate>{
	
	private int dd;
	private String mm;
	private int yy;
	public MyDate(){
		
		dd = 1;
		mm = "Jan";
		yy = 1900;
		
	}
	public MyDate(int dd,String mm,int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
	}
	public MyDate(String mm,int yy) {
		
		this.mm = mm;
		this.yy = yy;
		
	}
	public void setDd(int d) {
		dd = d;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int y) {
		yy = y;
	}
	public String getMm() {
		return mm;
	}
	public void setDd(String m) {
		mm = m;
	}
	public int getDd() {
		return dd;
	}
	
	public void dispDate() {
		System.out.println("Date is:"+dd+"-"+mm+"-"+yy);
	}
	
	public void setDate(int d,String m,int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	public String toString() {
		return "Date is:"+dd+"-"+mm+"-"+yy;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else {
			if(obj instanceof MyDate) {
			    MyDate temp  = (MyDate) obj;
				if(this.dd == temp.dd&&this.mm.equals(temp.mm)&&this.yy==temp.yy)
					return true;
				else
					return false;
			}
			else
				return false;
		}
	}
	
	public MyDate clone() throws CloneNotSupportedException {
		MyDate copy = null;
		//try {
		copy = (MyDate) super.clone();
		/*return copy;
		}
		catch(CloneNotSupportedException c) {
			System.out.println(c);
		}*/
		return copy;
	}
	@Override
	public int compareTo(MyDate o) {
		// TODO Auto-generated method stub
		return this.mm.compareTo(o.mm);
	}
	
	

}