package com.test;

public class Main2 {
	public static void main(String args []){
		//仓库
		Storage storage = new Storage(0);
		//生产者
		Cousrtem coustrem1 = new Cousrtem(storage,20);
		Cousrtem coustrem2 = new Cousrtem(storage,60);
		Cousrtem coustrem3 = new Cousrtem(storage,80);
		//消费者
		Producter producter1 = new Producter(storage,25);
		Producter producter2 = new Producter(storage,65);
		Producter producter3 = new Producter(storage,30);
		new Thread(coustrem1).start();
		new Thread(coustrem2).start();
		new Thread(coustrem3).start();
		new Thread(producter1).start();
		new Thread(producter2).start();
		new Thread(producter3).start();
	}
}
