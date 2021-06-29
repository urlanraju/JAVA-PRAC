package com.friends.practice.generics;

public class Student {
	int sid;
	
	String firstName;
	
	String lastName;
	
	String email;

	public Student(int sid, String firstName, String lastName, String email) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
}
