package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		//1 ¼¯ºÏµÄforeach
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
		map.forEach((k,v)->System.out.println(k+","+v));
		//2.Iterator
		map.keySet().iterator().forEachRemaining(System.out::println);
		map.values().iterator().forEachRemaining(System.out::println);
		//Set
		map.entrySet().iterator().forEachRemaining(e->System.out.println(e.getKey()+","+e.getValue()));
		//3.
		Iterator<Entry<Integer,String>> i = map.entrySet().iterator();
		
		while(i.hasNext()) {
			Entry<Integer,String> e = i.next();
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
	}

}
