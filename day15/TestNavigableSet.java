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
		//С�� ���� ָ������ ����� ����
		System.out.println(set.floor(33));//22
		//���� ���� ָ������ ����С����
		System.out.println(set.ceiling(33));//55
		//����ļ���
		System.out.println("---����");
		set.descendingSet().forEach(System.out::println);
		//����ĵ�����
		set.descendingIterator().forEachRemaining(System.out::println);
		//�Ƴ�Ԫ��
		set.pollFirst();//��һ��
		set.pollLast();//���һ��
		System.out.println(set);
		
	}

}
