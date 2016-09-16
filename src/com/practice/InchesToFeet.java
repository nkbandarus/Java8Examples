package com.practice;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InchesToFeet
{
	public static void main(String[] args)
	{
		int inches;
		int feet;
		int remainder;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many inches? ");
		inches = input.nextInt();
		
		//Calculate the whole number of feet by using integer division
		feet = inches/12;
		
		//Calculate the remaining number of inches
		remainder = inches%12;
		
		//Output formatted as follows (using escape characters):
		//71" equals 5'11"
		System.out.println(inches + "\" equals " + feet + "\' " + remainder + "\"");

	} //closes public static void main

} //closes public class InchesToFeet