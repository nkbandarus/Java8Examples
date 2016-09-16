package com.sample;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterCount {
    public static void main(String[] args) {
        String str = "aabbcccddd";
        IntStream st = str.chars();
        st.forEach(st1 -> {
            System.out.print(" "+st1);
        });
     StringBuilder output = new StringBuilder();
     str.chars()
        .mapToObj(i -> (char)i)
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .forEach((key, value) -> output.append(key).append(value));
     System.out.println(output);
     
     
     String str1 = "aababac";
    }
}