package com.java;

public class Windows {
	private static Piao piao = new Piao("临沂--杭州",51);//解决重复问题
	private String name;
	public Windows(String name){
		this.name = name;
	}
	public void sal(){
		int a = 0,b = 0,c = 0;
			while(true){
				int number = piao.getNumber();
				number--;
				piao.setNumber(number);
				if(number<1){
					System.out.println("票售尽");
					break;
				}
				//判断哪个窗口所售出的票
				if("窗口一".equals(name)){
					a++;
				}
				if("窗口二".equals(name)){
					b++;
				}
				if("窗口三".equals(name)){
					c++;
				}
				System.out.println(name+"卖出了第"+number+"张");
			}
		//输出
		if("窗口一".equals(name)){
			System.out.println("窗口一共售出"+a+"张票");
		}
		if("窗口二".equals(name)){
			System.out.println("窗口二共售出"+b+"张票");
		}
		if("窗口三".equals(name)){
			System.out.println("窗口三共售出"+c+"张票");
		}
	}
}
