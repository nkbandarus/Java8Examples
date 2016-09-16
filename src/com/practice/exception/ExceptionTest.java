package com.practice.exception;

public class ExceptionTest {

    public void callMethod(){
	throw new RuntimeException();
    }
    
    public void callMethod2(){
	System.out.println("G");
    }
    public static void main(String[] args) {
	System.out.println("A");
	ExceptionTest et = new ExceptionTest();
	try{
	    et.callMethod();
	    System.out.println("B");
	} catch(RuntimeException re){
	    System.out.println("C");
	} catch(Exception e){
	    System.out.println("D");
	} finally{
	    System.out.println("E");
	}
	System.out.println("F");
	et.callMethod2();
    }
}
