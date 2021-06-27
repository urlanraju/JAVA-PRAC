package com.friends.practice.io.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void printFileData() {
		try (FileInputStream fis = new FileInputStream("D:\\logs\\gargantua\\simple.txt")){
			
			 int content;
	            // reads a byte at a time, if it reached end of the file, returns -1
				while ((content = fis.read()) != -1) {
					System.out.print((char) content);
				}
			
		} catch (IOException e) {
			e.printStackTrace();
			
			//sms logic 
		}
		System.out.println();
	}
	
	public static void writeDataToFile() {
		try(FileOutputStream fos = new FileOutputStream("D:\\logs\\gargantua\\file-write.txt");Scanner s = new Scanner(System.in)) {
			System.out.println("\nEnter data into file : ");
			String data="";
			do {
				data = s.next();
				
				fos.write(data.charAt(0));
				
			} while(!data.equalsIgnoreCase("x"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			// email.log
		}
	}
	
	public static void readLine() {
		try (BufferedReader bis = new BufferedReader(new FileReader("D:\\logs\\gargantua\\simple.txt"))){
			String data;
			while ((data = bis.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)throws Exception {
		printFileData();
		
	
	}

}
