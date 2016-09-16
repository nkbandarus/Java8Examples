package com.practice;

public class ReplaceWordInString {

	static String replaceMethod(String original, String toReplace, String replacedWith) {
		for (;;) {
			int i = original.indexOf(toReplace);
			if (i == -1) {
				break;
			}
			original = original.substring(0, i) + replacedWith + original.substring(i + toReplace.length());
		}
		return original;
	}

	public static void main(String[] args) {
		String originalString = "This car is my car";
		
		String replacedString = replaceMethod(originalString, "car", "jeep");
		System.out.println(replacedString);
	}

}
