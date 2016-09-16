package com.practice;

import java.util.PriorityQueue;

public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        //Instantiating MyComaparator
 
    	//MyComparator comparator = new MyComparator();
        //Creating PriorityQueue of Employee objects with MyComparator as Comparator
 
        PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(7);
 
        //Adding Employee objects to pQueue
 
        pQueue.offer(new Employee("AAA", 15000));
 
        pQueue.offer(new Employee("BBB", 12000));
 
        pQueue.offer(new Employee("CCC", 7500));
 
        pQueue.offer(new Employee("DDD", 17500));
 
        pQueue.offer(new Employee("EEE", 21500));
 
        pQueue.offer(new Employee("FFF", 29000));
 
        pQueue.offer(new Employee("GGG", 14300));
 
        //Removing the head elements
 
        System.out.println(pQueue.poll());       //Output --> CCC : 7500
 
        System.out.println(pQueue.poll());       //Output --> BBB : 12000
 
        System.out.println(pQueue.poll());       //Output --> GGG : 14300
 
        System.out.println(pQueue.poll());       //Output --> AAA : 15000
 
        System.out.println(pQueue.poll());       //Output --> DDD : 17500
 
        System.out.println(pQueue.poll());       //Output --> EEE : 21500
 
        System.out.println(pQueue.poll());       //Output --> FFF : 29000
    }
}