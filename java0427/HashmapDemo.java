package com.test;

import java.util.*;

import java.io.*;

public class HashmapDemo {
//���������ַ�ʽ
//	public static void main(String[] args) {
//		Map hm =  new HashMap();
//		hm.put(1, "sb");
//		hm.put(2, "sb2");
//		hm.put(3, "sb3");
//		hm.put(4, "sb4");
//		/*Set set = hm.entrySet();
//		Iterator it =set.iterator();	//Iterator it = hm.entry.iterator();
//		while(it.hasNext()){
//			Map.Entry me = (Map.Entry)it.next();
//			System.out.println(me.getKey()+"--->"+me.getValue());
//		}*/
//		Iterator it = hm.keySet().iterator();
//		while(it.hasNext()){
//			Object o1 = it.next();
//			Object o2 = hm.get(o1);
//			System.out.println(o1+"--->"+o2);
//		}
//		
//	}
	
	
	/*//����ģʽ ����
	private static HashmapDemo singleton = new HashmapDemo();
	public static HashmapDemo getSingleton() {
		return singleton;
	}
	����
	private static HashmapDemo singleton = null;
	public static HashmapDemo getSingleton(){
		if(singleton == null){
			singleton = new HashmapDemo();
		}
		return singleton;
	}*/
	
	
	
	
	/* //����ģʽ
	public static void main(String args []){
		System.out.println("�������ֻ�����");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		Iceephone p = Factory.getIn(a);
	}
}
interface Iceephone{
	void send();
}
class HTC implements Iceephone{
	public void send(){
		System.out.println("HTC������");
	}
}
class VIVO implements Iceephone{
	public void send(){
		System.out.println("VIVO������");
	}
}
class MI implements Iceephone{
	public void send(){
		System.out.println("MI������");
	}
}
class Factory{
	public static Iceephone getIn(String type){
		Iceephone ic = null;
		if("HTC".equalsIgnoreCase(type)){
			ic = new HTC();
			ic.send();
		}else if("VIVO".equalsIgnoreCase(type)){
			ic = new VIVO();
			ic.send();
		}else if("MI".equalsIgnoreCase(type)){
			ic = new MI();
			ic.send();
		}
		return ic;
	}
}*/
	
}

//������ģʽ
//interface windows{
//	void send();
//	void sent();
//	void sens();
//}
//abstract class Spj implements windows{
//	public void send(){}
//	public void sent(){}
//	public void sens(){}
//}
//class Sy extends Spj{
//	public void sent(){}
//}

	

