package com.javac;

import java.util.*;

import java.util.Set;

public class HsahMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("z1", 1);
		hm.put("z2", 1);
		hm.put("z3", 2);
		/*System.out.println(hm);//输出集合
		System.out.println(hm.get("z1"));//查看指定key值得value值
		System.out.println(hm.containsKey("c"));//查看是否含有该key
		System.out.println(hm.containsValue(2));//查看是否含有该value
		System.out.println(hm.size());//查看集合中有多少元素
		HashMap hm2 = new HashMap();
		hm2.putAll(hm);//将集合hm复制到集合hm2中
		System.out.println(hm2);//输出集合
		hm2.remove("z3");//指定删除
		System.out.println(hm2);//输出集合
		hm2.clear();//清空集合
		System.out.println(hm2);//输出集合
		System.out.println(hm2.isEmpty());//查询集合是否为空 是返回true 否返回false
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
