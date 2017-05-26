package java0424;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		//·ºÐÍµÄÇ¶Ì×
		Map<String,String> map = new HashMap<>();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "C");
		map.put("4", "D");
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry  = it.next();
			System.out.println(entry.getKey() + "----->"+entry.getValue());
		}
				
	}

}
