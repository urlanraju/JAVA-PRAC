package com.friends.practice.exception;

public class IllegalUrlException extends Exception{

	private String url;
	
	public IllegalUrlException(String msg,String url) {
		super(msg);
	}
	
	public String getInvalidUrl() {
		return url;
	}

}
