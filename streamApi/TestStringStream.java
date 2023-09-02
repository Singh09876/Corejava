package com.rays.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStringStream {
public static void main(String[] args) {
	String[]arr= {"one","two","three","four","five","six"};
	
	List<String> list=Arrays.asList(arr);
	 Stream<String> stream=list.stream();
//	 Stream<String> stream=Arrays.stream(arr);{second method to achive same thing }
	 stream.sorted().forEach(System.out::println);
}
}
