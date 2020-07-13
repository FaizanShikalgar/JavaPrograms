package com.util;

import com.iface.Printable;

public class Address implements Printable {
	
	private String city;
	private String state;
	private String country;
	
	public Address() {
		
	}
	public Address(String city,String state,String country) {
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void displayAddress() {
		System.out.println("Address is:"+city+" \t"+state+"\t"+country);
	}
	@Override
	public void print() {
       displayAddress();
	
	}
	

}
