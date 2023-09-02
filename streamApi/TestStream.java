package com.rays.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestStream {
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		
		IntStream stream=Arrays.stream(arr);
//stream.forEach(	System.out::println);{printing statment}	
	//	stream.filter(e->e%2==0).  forEach(e->{System.out.println(e);});{this is for even number}
		stream.filter(e->e%2!=0).  forEach(e->{System.out.println(e);});//{this is for odd number}
		
	}

}
