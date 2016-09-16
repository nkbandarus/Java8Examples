package com.practice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CheckString {
	 static public void main(String[] args) {
		String sample = "34";
		boolean isValid = Stream.of(sample)
				.filter(s -> s!=null && !s.isEmpty())
				.filter(s -> s.chars().allMatch(Character::isDigit))
				//.filter(Pattern.compile("\\D").asPredicate().negate())
				.filter(i -> i.length()==2)
				.findAny()
				.isPresent();
		System.out.println(isValid);
	}
}
