package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in =new FileInputStream("C:\\Users\\arayn\\OneDrive\\Desktop\\fff.jpg");
		
		FileOutputStream out =new FileOutputStream("C:\\Users\\arayn\\OneDrive\\Desktop\\couching\\sss.jpg");
		int ch=in.read();
		
		while (ch!=-1) {
			out.write(ch);
			
			 ch=in.read();
		}
		
		
		in.close();
		System.out.println("data copied successfully");
	}
}
