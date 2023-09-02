package com.rays.io;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream file=new FileOutputStream("C:\\Users\\arayn\\OneDrive\\Desktop\\obj.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		HighEducation h=new HighEducation();
	h.id=1;
	h.name="aryan";
	h.Bm=100;
	h.Bmm=89;
	h.humanity=99;
	h.motivation=110;
	h.desiplene=97;
	h.total=h.Bm+h.Bmm+h.humanity+h.motivation+h.desiplene;
	out.writeObject(h);
	out.close();
	file.close();
	
	
	System.out.println("work done successfully");
	System.out.println("total="+h.total);
	
	
	}
	

}
