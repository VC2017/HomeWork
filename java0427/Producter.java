package com.test;

public class Producter implements Runnable {
	private Storage storage;
	private int number;
	
	public Producter(Storage storage, int number) {
		super();
		this.storage = storage;
		this.number = number;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		storage.push(number);
		}
	}
	
}
