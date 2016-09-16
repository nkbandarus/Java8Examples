package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Sorting {

	public static void main(String[] args) {
		Menu m1 = new Menu();
		m1.getClass().getMethods();
		List<Menu> menus = new ArrayList<>();
		menus.add(new Menu(600, "3rd dish"));
		menus.add(new Menu(500, "1st dish"));
		menus.add(new Menu(300, "2nd dish"));
		
		List<String> m = menus.stream()
			 .filter(d -> d.getCalories() > 400)
			 .sorted(Comparator.comparing(Menu::getCalories))
			 .map(Menu::getName)
			 .collect(Collectors.toList());
		System.out.println(m);
	}
}
