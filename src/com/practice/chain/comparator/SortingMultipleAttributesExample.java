package com.practice.chain.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.nullsLast;
import java.util.List;

public class SortingMultipleAttributesExample {
    public static void main(String[] args) {
        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(new Employee("Tom", null));
        listEmployees.add(new Employee("Sam", null));
        listEmployees.add(new Employee("Tim", null));
        listEmployees.add(new Employee("Bob", null));
        listEmployees.add(new Employee("Peter", null));
        listEmployees.add(new Employee("Craig", null));
        
        Collections.sort(listEmployees, new EmployeeChainedComparator(new EmployeeJobTitleComparator(),
                new EmployeeNameComparator()));
        
        Collections.reverse(listEmployees);
        
        /*Comparator<Employee> comparator = 
                comparing(Employee::getJobTitle, nullsLast(naturalOrder())).thenComparing(Employee::getName);*/

        /*Collections.sort(listEmployees, comparator);*/
        
        for(Employee emp : listEmployees){
            System.out.println("Employee Job "+emp.getJobTitle()+" Employee Name "+emp.getName());
        }
    }
}