package com.practice;

import java.text.DecimalFormat;

public class ConvertFeetToInch {

	public static void main(String[] args) {
		double inches = 2.2;
		double feet = inches / 12;
		double leftover = inches % 12;
		System.out.println(feet + " feet and " + leftover + " inches");
		
		DecimalFormat df = new DecimalFormat("###.####");
		System.out.println(Double.valueOf(df.format(feet)));
	}
}
