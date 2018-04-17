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
		//��һ��Ԫ��
		System.out.println(set.first());
		//���һ��Ԫ��
		System.out.println(set.last());
		//�Ӽ� [��ʼλ�õ�Ԫ�أ���ֹλ�õ�Ԫ�أ�
		System.out.println("------------------------");
		System.out.println(set.subSet("aa", "cc"));//aa bb
		
	}

}
