package com.javac;

import java.util.*;

import java.util.Set;

public class HsahMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("z1", 1);
		hm.put("z2", 1);
		hm.put("z3", 2);
		/*System.out.println(hm);//�������
		System.out.println(hm.get("z1"));//�鿴ָ��keyֵ��valueֵ
		System.out.println(hm.containsKey("c"));//�鿴�Ƿ��и�key
		System.out.println(hm.containsValue(2));//�鿴�Ƿ��и�value
		System.out.println(hm.size());//�鿴�������ж���Ԫ��
		HashMap hm2 = new HashMap();
		hm2.putAll(hm);//������hm���Ƶ�����hm2��
		System.out.println(hm2);//�������
		hm2.remove("z3");//ָ��ɾ��
		System.out.println(hm2);//�������
		hm2.clear();//��ռ���
		System.out.println(hm2);//�������
		System.out.println(hm2.isEmpty());//��ѯ�����Ƿ�Ϊ�� �Ƿ���true �񷵻�false
		*/Set set = hm.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry mt = (Map.Entry) it.next();
			System.out.println(mt.getKey()+"\t"+mt.getValue() );
			//System.out.println(mt.getValue() );
		}
		Iterator it1 = hm.keySet().iterator();
		while(it1.hasNext()){
			Object key = it1.next();
			Object values = hm.get(key);
		}
		/*hm.replace("z1", 6666);
		System.out.println(hm.entrySet());*/
		//System.getProperties
	}

}
