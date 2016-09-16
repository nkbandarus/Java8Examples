package com.practice.chain.comparator;
 
public class Employee {
    private String name;
    private String jobTitle;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
 
    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }
 
    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle);
    }
}