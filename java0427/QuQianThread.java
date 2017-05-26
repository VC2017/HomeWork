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
			if(zhangHu.getNumber()>=money){//������
				zhangHu.setNumber(zhangHu.getNumber()-money);
				System.out.println("ȡǮ�ɹ������"+zhangHu.getNumber());
			}else{
				System.out.println("���㣬�������"+zhangHu.getNumber());
			}
		}
		
	}
	
	
}
