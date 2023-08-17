package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class testCollection {
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add("aryan");
		
		Collection c2= new ArrayList();
		
		c2.add('i');
		c2.add('a');
		c2.add('m');
		c2.add("mahi");
		System.out.println(c1);
		System.out.println(c2);
c1.addAll(c2);
System.out.println(c1);
System.out.println(c1.containsAll(c2));
//c1.clear();
System.out.println(c1.isEmpty());

c1.remove('a');
c1.remove("mahi");
System.out.println(c1);

	}

}
