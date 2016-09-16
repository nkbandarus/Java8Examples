package com.practice;

public class Menu {

	private int calories;
	private String name;
	
	public Menu() {
		
	}
	
	public Menu(int calories, String name){
		this.setCalories(calories);
		this.setName(name);
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
