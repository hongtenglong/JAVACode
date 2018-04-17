package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**示例：遍历*/
public class TestIterator {

	public static void main(String[] args) {
		// 遍历
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		//1.普通for
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//2.增强for
		for(String s:list) {
			System.out.println(s);
		}
		//3.简单
	/*	list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});*/
//		list.forEach(t->System.out.println(t));
		//
		list.forEach(System.out::println);
		//4.迭代器 Collection
		Iterator<String> i = list.iterator();
/*		System.out.println(i.next());
		i.remove();
		System.out.println(i.next());
		//删除的 是 最近一次 访问 next()的那个元素
		i.remove();
		System.out.println(i.next());
		System.out.println(list);*/
		System.out.println("--------Iterator------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//5.迭代器的方法
		Iterator<String> i1 = list.iterator();
		i1.forEachRemaining(System.out::println);
		//6.ListIterator 是 Iterator的子接口 ，针对于 List接口的遍历
		System.out.println("---------ListIterator------------------");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			li.add("hello");
		}
		System.out.println(list);
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		//7 Stream
		list.stream().forEach(System.out::println);
		
	}

}
