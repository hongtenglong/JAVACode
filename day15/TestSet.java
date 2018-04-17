package day15;

import java.util.HashSet;
import java.util.Set;

/**Ê¾Àı£ºSet*/
public class TestSet {

	public static void main(String[] args) {
		Set<String> set  = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("aa");
		System.out.println(set);
	}

}
