package com.rays.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDeserialization {

	public static void main(String[] args)throws Exception  {
		
		FileInputStream file=new FileInputStream("C:\\Users\\arayn\\OneDrive\\Desktop\\obj.txt");
		ObjectInputStream in =new ObjectInputStream(file);
		
		HighEducation h= (HighEducation)in.readObject();
		
		
		System.out.println("id="+h.id);
		System.out.println("name="+h.name);

		System.out.println("bm="+h.Bm);

		System.out.println("bmm="+h.Bmm);
		System.out.println("humanity="+h.humanity);
		System.out.println("motivation="+h.motivation);

		System.out.println("desiplene="+h.desiplene);
		System.out.println("total="+h.total);
			in.close();
			file.close();

		
		
		
	}
	
}
