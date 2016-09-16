package com.practice;

public class Shape {
	public Shape(){
		System.out.println("In Shape Constructor");
	}
	public class Color{
		public Color(){
			System.out.println("In Color Const...");
		}
		
		public void print(){
			System.out.println("In Color");
		}
	}
	
	public void print(){
		System.out.println("In Shape");
	}
}
