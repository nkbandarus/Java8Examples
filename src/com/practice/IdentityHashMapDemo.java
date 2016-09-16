package com.practice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
	
	static public void main(String args[]) {
      // Create a hash map
      IdentityHashMap ihm = new IdentityHashMap();
      // Put elements to the map
      ihm.put("Zara", new Double(3434.34));
      ihm.put("Mahnaz", new Double(123.22));
      ihm.put("Ayan", new Double(1378.00));
      ihm.put("Daisy", new Double(99.22));
      ihm.put("Qadir", new Double(-19.08));
      
      Hashtable<String, Double> ihm1 = new Hashtable<>();
      ihm1.put("Zara", new Double(3434.34));
      ihm1.put("Mahnaz", new Double(123.22));
      ihm1.put("Ayan", new Double(1378.00));
      
      Enumeration enum1 = ihm1.keys();
      if(enum1.hasMoreElements()){
    	  System.out.println(enum1.nextElement());
      }
      // Get a set of the entries
      Set set = ihm.entrySet();
      
      System.out.println(set);
      
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance = ((Double)ihm.get("Zara")).doubleValue();
      ihm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " +
      ihm.get("Zara"));
   }
}