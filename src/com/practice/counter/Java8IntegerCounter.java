package com.practice.counter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8IntegerCounter {
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,3,3,4,7};
		
		Map<Integer, Long> map = Stream.of(intArray).collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));
		System.out.println(map.get(3));
	}
}