package com.java;

public class Windows {
	private static Piao piao = new Piao("����--����",51);//����ظ�����
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
					System.out.println("Ʊ�۾�");
					break;
				}
				//�ж��ĸ��������۳���Ʊ
				if("����һ".equals(name)){
					a++;
				}
				if("���ڶ�".equals(name)){
					b++;
				}
				if("������".equals(name)){
					c++;
				}
				System.out.println(name+"�����˵�"+number+"��");
			}
		//���
		if("����һ".equals(name)){
			System.out.println("����һ���۳�"+a+"��Ʊ");
		}
		if("���ڶ�".equals(name)){
			System.out.println("���ڶ����۳�"+b+"��Ʊ");
		}
		if("������".equals(name)){
			System.out.println("���������۳�"+c+"��Ʊ");
		}
	}
}
