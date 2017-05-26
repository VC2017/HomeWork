package java0419;

import java.util.*;

public class HashCode {

	public static void main(String[] args) {
		HashSet a = new HashSet();
		a.add("c");
		HashSet b = new HashSet();
		b.add("a");
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		String c = "adsfa";
		String d = "adsfa";
		System.out.println(c.equals(d));
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
	}

}
