package com.rays.core_java_8;

import java.util.Arrays;

public class TestParralelSort {
public static void main(String[] args) {
	int []arr= {100,20,10,30,80,32};
	Arrays.parallelSort(arr);
	for(int i:arr) {
		System.out.println(i);
	}
}
}
