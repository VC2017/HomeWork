package com.java;

public class MainDemo {

	public static void main(String[] args) {
		// ������������
		Windows w1 = new Windows("����һ");
		Windows w2 = new Windows("���ڶ�");
		Windows w3 = new Windows("������");
		// ���������߳�
		WindowsThread wt1 = new WindowsThread(w1);
		WindowsThread wt2 = new WindowsThread(w2);
		WindowsThread wt3 = new WindowsThread(w3);
		//��ʼ�߳�
		wt1.start();
		wt2.start();
		wt3.start();
	}

}
