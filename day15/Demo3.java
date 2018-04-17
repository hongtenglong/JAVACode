package day15;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("bb");
		s.add("aa");
		s.add("cc");
		s.forEach(System.out::println);
	}
}








