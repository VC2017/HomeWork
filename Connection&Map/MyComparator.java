package com.javac;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Students m1 = (Students)o1;
		Students m2 = (Students)o2;
		if(m1.getGrade()==m2.getGrade()){
			if(m1.getAge()>m2.getAge()){
				return 1;
			}
			if(m1.getAge()<m2.getAge()){
				return -1;
			}
			return 0;
		}
		if(m1.getGrade()<m2.getGrade()){
			return 1;
		}
		if(m1.getGrade()>m2.getGrade()){
			return -1;
		}
		return 0;
		
	}
	
	
}





