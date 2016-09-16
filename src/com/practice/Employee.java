package com.practice;

class Employee implements Comparable<Employee>
{
    String name;
 
    int salary;
 
    //Constructor Of Employee
 
    public Employee(String name, int salary)
    {
        this.name = name;
 
        this.salary = salary;
    }
 
    @Override
    public String toString()
    {
        return name+" : "+salary;
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary - o.salary;
	}

}