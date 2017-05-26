package com.test;

public class QuQianThread implements Runnable {
	private ZhangHu zhangHu;
	private int money;
	public QuQianThread(ZhangHu zhangHu, int money) {
		this.zhangHu = zhangHu;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(zhangHu){
			if(zhangHu.getNumber()>=money){//Óà¶î³ä×ã
				zhangHu.setNumber(zhangHu.getNumber()-money);
				System.out.println("È¡Ç®³É¹¦£¬Óà¶î"+zhangHu.getNumber());
			}else{
				System.out.println("Óà¶î²»×ã£¬ÏÖÓĞÓà¶î"+zhangHu.getNumber());
			}
		}
		
	}
	
	
}
