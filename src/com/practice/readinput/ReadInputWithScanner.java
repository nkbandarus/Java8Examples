package com.practice.readinput;

// Code using Scanner Class
import java.util.Scanner;

public class ReadInputWithScanner {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("%5d", 23);
        System.out.println("Enter an integer");
        int a = scn.nextInt();
        System.out.println("Enter a String");
        String b = scn.nextLine();
        System.out.printf("You have entered:- " + a + " " + "and name as " + b);
    }
}