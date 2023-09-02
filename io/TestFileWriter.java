package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer=new FileWriter("C:\\io\\Aryan.txt",true);
		writer.write("singh");
		
		writer.close();
System.out.println("data write successfully");
		
	}
}
