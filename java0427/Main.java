package com.test;

public class Main {

	public static void main(String[] args) {
		ZhangHu zhangHu = new ZhangHu("as",4000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QuQianThread ka = new QuQianThread(zhangHu, 3000);
		QuQianThread zhe = new QuQianThread(zhangHu, 2000);
		new Thread(ka).start();
		new Thread(zhe).start();
	}

}
