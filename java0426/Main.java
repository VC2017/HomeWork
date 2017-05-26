package com.java;

public class Main {

	public static void main(String [] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		for(int i = 0;i<1000;i++){
			System.out.println(i);
		}
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
	}

}
