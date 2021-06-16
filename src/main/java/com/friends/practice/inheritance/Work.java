package com.friends.practice.inheritance;

import com.friends.practice.exception.IllegalUrlException;

public interface Work {

	String doRestAPIWork(String url) throws IllegalUrlException;
	
	String getDataFromDB(String name);
}
