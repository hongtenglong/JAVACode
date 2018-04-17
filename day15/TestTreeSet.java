package day15;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<>();
		set.add("cc");
		set.add("aa");
		set.add("bb");
		set.forEach(System.out::println);
		//第一个元素
		System.out.println(set.first());
		//最后一个元素
		System.out.println(set.last());
		//子集 [起始位置的元素，终止位置的元素）
		System.out.println("------------------------");
		System.out.println(set.subSet("aa", "cc"));//aa bb
		
	}

}
