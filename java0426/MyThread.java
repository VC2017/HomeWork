package com.java;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i = 0;i<1000;i++){
			System.out.println((int)(Math.random()*2+1));
		}
	}

}
