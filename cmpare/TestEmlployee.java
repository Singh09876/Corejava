package com.rays.cmpare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.List;

public class TestEmlployee {

	public static void main(String[] args) {
		Employee e1 =new Employee(1,"Aryan",5100000);
		Employee e2 =new Employee(5,"Mahi",5100000);
		Employee e3 =new Employee(3,"Shivanshi",5100000);
		Employee e4 =new Employee(4,"Preksha",5100000);
		Employee e5 =new Employee(2,"Hritika",5100000);
		Employee e6 =new Employee(6,"Aaryan",5100000);

		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		//Collections.sort(list);
//		Collections.sort(list,new OrderByIdAsc());
		//Collections.sort(list,new OrderByIdDsc());
		Collections.sort(list,new OrderByNameDsc());
		for(Employee employee:list) {
		System.out.println(employee);
		}
		
	}
}
