package com.friends.practice.exception;

import com.friends.practice.inheritance.RestAPIWork;
import com.friends.practice.inheritance.Work;

public class ExceptionHandling {

	static Work work = new RestAPIWork();
	
	public static int division(int a,int b) throws Exception {
		if(b == 0) {
			throw new Exception("Divisor can't be zero");
		}
		return a/b;
	}
	
	public static String getUserOrders(String name) throws UserDataNotFoundException, IllegalPersonException {
		try {
			String restDone = work.doRestAPIWork("https://meet.google.com/vcc-ruhp-sey");
		} catch (IllegalUrlException e) {
			System.out.println(e.getMessage());
		}
		
		String data = work.getDataFromDB(name);
		
	
		
		if(name.equalsIgnoreCase("xyz")) {
			throw new IllegalPersonException("Illegal person i won't give data");
		}
		
		if(data==null)
			throw new UserDataNotFoundException("NO data found for the user : "+name);
		
	
		return data;
	}
	
	
	public static void main(String[] args) {
		
		
			try {
				System.out.println(getUserOrders("vikas"));
			} catch (UserDataNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalPersonException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
