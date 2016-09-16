package com.sample;

import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeat {

    public static void main(String[] args) {
        Map<Character, Long> collect =  "abcsdnv".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
        //firstRepeatedNonRepeatedChar("abcsdnvs");
    }
    
    /*static void firstRepeatedNonRepeatedChar(String s) {
        if(s.isEmpty()) {
            System.out.println("empty string");
            return;
        }
        BitSet seen=new BitSet(), repeated=new BitSet();
        s.chars().forEachOrdered(c -> (seen.get(c)? repeated: seen).set(c));
        if(repeated.isEmpty()) System.out.println("first unique: "+s.charAt(0));
        else {
            s.chars().filter(repeated::get).findFirst()
                     .ifPresent(c -> System.out.println("first repeated: "+(char)c));
            s.chars().filter(c -> !repeated.get(c)).findFirst()
                     .ifPresent(c -> System.out.println("first unique: "+(char)c));
        }
    }*/
}