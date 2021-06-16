package com.friends.practice.inheritance;

import com.friends.practice.exception.IllegalUrlException;

public class RestAPIWork extends DBAbstract{

	public String doRestAPIWork(String url) throws IllegalUrlException {
		String data = getDataFromDB("vikas");
		//
		///
		
		
		//
		///
		
		if(!url.startsWith("http")) {
			throw new IllegalUrlException("Not a valid url : "+url);
		}
		return "Rest API work done "+data;
	}

	

	

}
