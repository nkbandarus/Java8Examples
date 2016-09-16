package com.practice;
public class StringExamples
{
    public static void main(String[] args)
    {
        String s1 = new String("JAVA");
 
        String s2 = s1.intern();       //Creating String Intern
 
        System.out.println(s1 == s2);       //Output : false
 
        System.out.println(s1.equals(s2));    //Output : true
    }
}