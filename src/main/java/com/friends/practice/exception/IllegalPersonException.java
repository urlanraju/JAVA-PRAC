package com.friends.practice.exception;

public class IllegalPersonException extends Exception{

	private String name;
	
	public IllegalPersonException(String msg,String name) {
		super(msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
