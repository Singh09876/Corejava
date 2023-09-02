package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	
	
public static void main(String[] args) throws IOException {
	
	FileReader file= new FileReader("C:\\io\\Aryan.txt");
	
	BufferedReader reader = new BufferedReader(file);
	
	String line=reader.readLine();
	
	while (line!=null) {
		
		System.out.println(line);
		
		line=reader.readLine();
		
	}
	
	reader.close();
	file.close();
	
	
	
}
}
