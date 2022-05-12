package com.friends.practice.mutithreading;

import java.io.Serializable;

public class Multithreading {
	
	public static void thread() {
		// parellel processing
				Task mannu = new Task("mannu voice");
				Task venk = new Task("venk screen");
				Task mangal = new Task("mangal voice");
				
				mannu.start();
				
				venk.start();
				
				mangal.start();
				
				// Data from DB
						// make pdf 
						// send email to employees
				
				
				// Data from DB
						// make excel 
						// send email to employees
	}
	
	
	
	// maven quickstart project
	public static void main(String[] args) {
		
		BookTicket mannu = new BookTicket("mannu ");
		BookTicket mangal = new BookTicket("mangal");
		
		new Thread(mannu).start();
		
		new Thread(mangal).start();
		
		// 1lakh
		
	}

}

class Task extends Thread{
	
	String name;
	Task(String name){
		this.name = name;
	}

	public void run(){  
		//System.out.println("thread is running...");  
		// get my voice from internet 
				// add it to speaker
		
		// Data from DB
		// make pdf 
		// send email to employees
		System.out.println("done task : "+name);
	}  
}

class BookTicket implements Runnable,Serializable{
	String name;
	BookTicket(String name){
		this.name = name;
	}
	@Override
	public void run() {
		if(isAvailable())
		System.out.println("ticket booked : "+name);
	}
	
	private synchronized boolean isAvailable() {
		System.out.println("yes");
		
		if(true) {
			// seat logic // threater logic // irctc  // banking
		}
		return true;
	}
	
}
