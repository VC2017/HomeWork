package com.java;

public class MainDemo {

	public static void main(String[] args) {
		// 创建三个窗口
		Windows w1 = new Windows("窗口一");
		Windows w2 = new Windows("窗口二");
		Windows w3 = new Windows("窗口三");
		// 创建三个线程
		WindowsThread wt1 = new WindowsThread(w1);
		WindowsThread wt2 = new WindowsThread(w2);
		WindowsThread wt3 = new WindowsThread(w3);
		//开始线程
		wt1.start();
		wt2.start();
		wt3.start();
	}

}
