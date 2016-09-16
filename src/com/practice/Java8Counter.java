package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Counter {
	public static void main(String[] args) {
		String[] arr = {"program", "creek", "program", "creek", "java", "web", "program"};
		Stream<String> stream = Stream.of(arr).parallel();
		//Map<String, Long> counter = stream.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		Set<String> str = stream.collect(Collectors.toSet());
		//System.out.println(counter.get("creek"));
		System.out.println(str);
		/*int i = Integer.MIN_VALUE;
		String[] arr = {"program", "creek"};
		List<String> str = Arrays.asList(arr);
		String[] arr1 = (String[]) str.toArray();
		Stream<String> stream1 = Stream.of(arr).parallel();
		Map<String, Integer> map = stream1.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
		
		System.out.println(System.identityHashCode(map));*/
		
	}
}