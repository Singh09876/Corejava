package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLineByLine {
public static void main(String[] args) throws IOException {
	
	
	FileWriter file=new FileWriter("C:\\io\\Aryan.txt",true);
	
	PrintWriter out =new 	PrintWriter(file);
	 out.println("i am back");
	 out.println("let you \nknow me");
	 
	 out.close();
	 file.close();
System.out.println("data write successfully");
	
	
	
}
}
