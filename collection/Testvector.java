package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Testvector {
public static void main(String[] args) {
	
	Vector v=new Vector();
	v.add(100);
	v.add("one");
	v.add('w');
	Enumeration e=v.elements();
	v.add(6);
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
}
}
