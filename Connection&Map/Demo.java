package com.javac;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//����Ԫ��
		c.add("asdf");
		c.add(6);
		System.out.println(c.add("b"));
		System.out.println(c.contains("asdf"));
		//ɾ��Ԫ�� 6 
		c.remove(6);
		c.add("ase");
		c.add(5);
		//��������е�Ԫ�ظ���
		System.out.println(c.size());
		//���ؼ���c���Ƿ���6Ԫ��
		System.out.println(c.contains(6));
		//�����¼���
		Collection books1 = new HashSet();
		books1.add("ase");
		books1.add(5);
		//����c�������Ƿ��м���books1��ȫ��Ԫ��
		System.out.println(c.containsAll(books1));
		//ɾ������c����books1��ͬ��Ԫ��
		c.removeAll(books1);
		System.out.println(c.size());
		//ɾ������c����books1���ϵĲ�ͬ����
		c.retainAll(books1);
		System.out.println(c);
		System.out.println(books1);
		//���c����
		c.clear();
		//���ؼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		//������cת��������
		System.out.println(c.toArray());
		//�������c
		System.out.println(c);
		c.addAll(books1);
	}

}
