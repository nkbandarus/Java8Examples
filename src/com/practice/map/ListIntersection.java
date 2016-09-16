package com.practice.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListIntersection {

    public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	IntStream.range(0, 1000000).forEach(i-> {
	    list1.add("list"+i);
	});
	List<String> list2 = new ArrayList<>();
	IntStream.range(100, 200).forEach(i-> {
	    list2.add("list"+i);
	});
	
	 
	 long startTime = System.nanoTime();
	//List<String> intersect = list1.stream().filter(list2::contains).collect(Collectors.toList());
	 list1.removeAll(list2);
	 long endTime = System.nanoTime();
	long duration = endTime - startTime;
	System.out.println("Intersection Duration:  " + duration);
	//System.out.println(intersect);
    }
}
