package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
	    Map<Object, String> m = new HashMap<Object, String>();
	    Dog d1 = new Dog("clover");
	    Dog d2 = new Dog("clover 2");
	    m.put(d1, "Dog 1");
	    m.put(d2, "Dog 2");
	    System.out.println(m.get(d2)); 
	}
}
