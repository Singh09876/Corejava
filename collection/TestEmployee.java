package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 =new Employee(44, "Hritika", "Indore");
		Employee e2 =new Employee(45, "Aryan", "Bhopal");
		
		ArrayList list=new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
//		for (int i = 0; i < list.size(); i++) 
		
//		for (Object object : list) 
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Employee e=(Employee)it.next();

		
			
		
			
			
		
		
		System.out.println(e);
		it.remove();
	}
		System.out.println(list);

}
}
