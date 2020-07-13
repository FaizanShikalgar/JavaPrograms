package com.iface;

public interface Callbale {
	
	void call();

}

interface Showable{
	void show();
}


interface myiface extends Callbale,Showable{
	
}