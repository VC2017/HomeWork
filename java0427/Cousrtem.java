package com.test;

public class Cousrtem implements Runnable {
	private Storage storage;
	private int number;
	
	public Cousrtem(Storage storage, int number) {
		super();
		this.storage = storage;
		this.number = number;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		storage.pop(number);
		}
	}
	
}
