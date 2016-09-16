package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class ReplaceCharacterInString{
	
	static String replaceMethod(String original, String toReplace, String replacedWith) {
	    for(;;) {
	        int i = original.indexOf(toReplace);
	        if (i == -1) {
	            break;
	        }
	        original = original.substring(0, i) + replacedWith + original.substring(i + toReplace.length());
	    }
	    return original;
	}
	
   public static void main(String[] args){
      String originalString = "This car is my car";
      String[] arr = originalString.split(" ");
      StringBuilder output = new StringBuilder();
      for (int i=0; i <= arr.length - 1; i++)
          output.append(arr[i]);
      
      List<String> toRemove = Arrays.asList("1", "2", "3");
      String text = "Hello 1 2 3";
      toRemove.stream()
                   .map(toRem-> (Function<String,String>)s->s.replaceAll(toRem, ""))
                   .reduce(Function.identity(), Function::andThen)
                   .apply(text);
      //String replacedString = replaceMethod(output.toString(), "i", "p");
      System.out.println(text);
   }  
}
