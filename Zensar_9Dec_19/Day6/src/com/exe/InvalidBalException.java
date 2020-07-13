package com.exe;

@SuppressWarnings("serial")
public class InvalidBalException extends Exception {
	
	String msg;
	public InvalidBalException(String msg) {
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}

}
