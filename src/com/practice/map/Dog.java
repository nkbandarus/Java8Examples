package com.practice.map;

class Dog {
    private String name;

    public Dog(String n) {
	name = n;
    }

    @Override
    public boolean equals(final Object o) {
	System.out.println("equals called..");
	return true;
    }

    @Override
    public int hashCode() {
	System.out.println("hashCodecalled..");
	return 1; // constant
    }
}