package com.practice;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void printStringUpper(String str){
		System.out.println(str.toUpperCase());
	}
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("java", "ruby", "scala");
		strList.forEach(MethodReference::printStringUpper);
		
		strList.forEach(MethodReference::printStringUpper);
	}
}
