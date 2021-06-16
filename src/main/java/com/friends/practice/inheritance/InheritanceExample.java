package com.friends.practice.inheritance;

public class InheritanceExample {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		
		Vehicle v2 = new Bike();
		
		System.out.println(v1.getTyreCount() +"...."+v1.getVehicleName());
		System.out.println(v2.getTyreCount() +"...."+v2.getVehicleName());
		
		
		Report r1 = new PdfReport();
		r1.getReport(2);
		
		Report r2 = new ExcelReport();
		r2.getReport(2);
		
		System.out.println(Parent.surname);
	}
}

class Car implements Vehicle{

	public int getTyreCount() {
		return 4;
	}

	public String getVehicleName() {
		return "Car Maruthi Suzuki";
	}
	
}

class Bike implements Vehicle{

	public int getTyreCount() {
		return 2;
	}

	public String getVehicleName() {
		return "Bike Gixxer";
	}
	
}
