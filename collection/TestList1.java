package com.rays.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList1 {
	
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(1);
		list.add("one");
		list.add(2);
		Iterator it=list.iterator();
//		list.add(2);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
