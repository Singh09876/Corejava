package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ReadByScanner {

	public static void main(String[] args) throws Exception {
		FileReader file= new FileReader("C:\\io\\Aryan.txt");
		 Scanner sc=new Scanner(file);
		 while (sc.hasNext()) {
			 System.out.println(sc.nextLine());
			
		}
		
		sc.close();
		file.close();
	}
	
}
