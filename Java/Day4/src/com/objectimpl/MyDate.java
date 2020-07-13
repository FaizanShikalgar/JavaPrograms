package com.objectimpl;

import javax.swing.text.StyledEditorKit.BoldAction;

public class MyDate {

	private int dd;
    private String mon;
    private int yy;
    
    public MyDate() {
    	dd = 1;
    	mon = "Jan";
    	yy = 1900;
   	}
    public MyDate(int dd,String mon,int yy) {
    	this.dd = dd;
    	this.mon = mon;
    	this.yy = yy;
    }
    
    
    public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void displayDate(){
        System.out.println("Date is: "+dd+"-"+mon+"-"+yy);
    }
   
    public void setDate(int d,String m,int y){
        dd = d;
        mon = m;
        yy = y;
    }
    public String toString() {
    	return "Date is:"+dd+"-"+mon+"-"+yy;
    }
    public boolean equals(Object obj) {
    	if(this==obj) {
    		System.out.println("Refernces pointing to same obj");
    		return true;
    	}
    	else {
    		System.out.println("Two Diiferent object to get compared");
    		if(obj instanceof MyDate) {
        		MyDate temp = (MyDate) obj;
        		if(this.dd==temp.dd&&this.mon.equals(temp.mon)
        				&&this.yy==temp.yy) {
        		    return true;	
        		}
        		else {
        			return false;
        		}
        	}
        	else {
        		return false;
        	}
    	}
    	
    	
    	
    }
    
    
 

}