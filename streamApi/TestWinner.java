package com.rays.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestWinner {
	public static void main(String[] args) {
		
		ArrayList<Winner>list =new ArrayList<Winner>();
		
		
		list.add(new Winner ("Aryan","1112300000") );
		list.add(new Winner("mahi","2112307700"));
		list.add(new Winner("srajal","31123001000"));
		list.add(new Winner("mayank","4112308000"));
		list.add(new Winner ("shiva","5112306000"));
		list.add(new Winner ("pallavi","6112900000"));
		
		list.stream().map(e->e.name).filter(e->e.length()==10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);
		return e.stream();
		})).limit(6).forEach(e->{System.out.println(e);
		
		});
		
	}

}
