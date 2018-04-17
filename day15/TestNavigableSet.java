package day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(11);
		set.add(22);
		set.add(55);
		set.add(77);
		System.out.println(set);
		//小于 等于 指定参数 的最大 整数
		System.out.println(set.floor(33));//22
		//大于 等于 指定参数 的最小整数
		System.out.println(set.ceiling(33));//55
		//降序的集合
		System.out.println("---降序");
		set.descendingSet().forEach(System.out::println);
		//降序的迭代器
		set.descendingIterator().forEachRemaining(System.out::println);
		//移除元素
		set.pollFirst();//第一个
		set.pollLast();//最后一个
		System.out.println(set);
		
	}

}
