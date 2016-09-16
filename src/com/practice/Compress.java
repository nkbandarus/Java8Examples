package com.practice;
public class Compress {
      public static void main(String[] args) {
         String word = "aaabbc";
         System.out.println(compress(word));
      }


      public static String compress (String original){
             String compressed = "";

             char ch = original.charAt(0);
             int counter = 1;
             for (int i = 1; i < original.length(); i++) { 
                if (ch == original.charAt(i)) {
                   counter = counter + 1;
                } 
                else {
                    compressed = compressed + ch;
                   if(counter != 1){
                      compressed = compressed + counter;
                   }
                   ch = original.charAt(i);
                   counter = 1;
                }
             }
             compressed = compressed + ch;
             if(counter != 1){
                compressed = compressed + counter;
             }
             return compressed;
      }
}