package com.rays.collection;

import java.util.ArrayList;

public class TestEmployee2 {
public static void main(String[] args) {
	
	Employee2 e1 = new Employee2(22, "Aryan", "Indore");
	
	Employee2 e2 = new Employee2(22, "Aryan", "Indore");
	
	
	ArrayList list=new ArrayList();
	list.add(e1);
	list.add(e2);
	
	System.out.println(list);
	
	
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
