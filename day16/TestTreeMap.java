package day16;

import java.util.SortedMap;
import java.util.TreeMap;
/**Ê¾Àý£ºTreeMap*/
public class TestTreeMap {

	public static void main(String[] args) {
//		Map<Integer,String> map = new HashMap<>();
//		Set<Integer> set = new HashSet<>();
		SortedMap<Integer,String> map = new TreeMap<>();
		map.put(2, "bb");
		map.put(1, "aa");
		map.put(3, "cc");
		System.out.println(map);
		
	}

}
