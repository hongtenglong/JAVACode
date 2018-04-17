package day15.homeWork;

import java.util.ArrayList;
import java.util.List;

class Qq{
	private String name;

	public Qq(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Qq [name=" + name + "]";
	}
	
}


public class ZuoYe1 {
	public static void main(String[] args) {
		List<Qq> list = new ArrayList<>();
		list.add(new Qq("张1"));
		list.add(new Qq("张2"));
		list.add(new Qq("张3"));
		list.add(new Qq("张4"));
		list.add(new Qq("张5"));
		list.add(new Qq("张6"));
		list.add(new Qq("张7"));
		list.add(new Qq("张8"));
		list.add(new Qq("张9"));
		System.out.println("总共有"+list.size()+"只企鹅");
		//遍历输出
		list.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		//删除集合中索引值是2的企鹅的元素
		list.remove(2);
		list.forEach(System.out::println);
	}
}
