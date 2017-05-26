package com.javac;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//增加元素
		c.add("asdf");
		c.add(6);
		System.out.println(c.add("b"));
		System.out.println(c.contains("asdf"));
		//删除元素 6 
		c.remove(6);
		c.add("ase");
		c.add(5);
		//输出数组中的元素个数
		System.out.println(c.size());
		//返回集合c中是否有6元素
		System.out.println(c.contains(6));
		//创建新集合
		Collection books1 = new HashSet();
		books1.add("ase");
		books1.add(5);
		//返回c集合中是否含有集合books1的全部元素
		System.out.println(c.containsAll(books1));
		//删除集合c中与books1相同的元素
		c.removeAll(books1);
		System.out.println(c.size());
		//删除集合c中与books1集合的不同部分
		c.retainAll(books1);
		System.out.println(c);
		System.out.println(books1);
		//清空c集合
		c.clear();
		//返回集合是否为空
		System.out.println(c.isEmpty());
		//将集合c转化成数组
		System.out.println(c.toArray());
		//输出集合c
		System.out.println(c);
		c.addAll(books1);
	}

}
