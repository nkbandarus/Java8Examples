package com.practice.threads;

class MyThread1 implements Runnable {

    @Override
    public void run() {
	// TODO Auto-generated method stub
	System.out.println("Run Thread");
    }

}

public class ImplementsRunnable {
    public static void main(String[] args) {
	MyThread1 thread = new MyThread1();
	Thread t = new Thread(thread);
	t.start();
	//thread.run();
    }
}