package com.friends.practice.io;

import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

	int a = 12;

	int g = 13;

	public static void main(String[] args) throws IOException {
		
		;
		
		try(Scanner s = new Scanner(System.in)) {
			
			
			System.out.println("Enter a age ");
			
			
				Integer age = Integer.parseInt(s.nextLine());
				
				System.out.println("Employeee age is "+age);
				
				
		}catch (Exception e) {
			System.out.println("sgsdgs");
			String n = null;
			
			n.charAt(0);
		}finally {
			
		}
			
	}

}
