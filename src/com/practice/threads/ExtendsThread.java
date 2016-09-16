package com.practice.threads;
class MyThread extends Thread
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
 
public class ExtendsThread
{
    //Main Thread
    public static void main(String[] args) {
        //Creating and starting MyThread.
        MyThread myThread = new MyThread();
        myThread.start();
    }
}