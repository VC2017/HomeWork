package com.javac;

import java.util.*;

public class HC {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(new Students("����",11,80));
		ts.add(new Students("������",9,90));
		ts.add(new Students("����",13,90));
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Properties ps = System.getProperties();
		ps.list(System.out);
	} 

}
