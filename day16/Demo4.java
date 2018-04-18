package day16;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private String athor;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String athor, double price) {
		super();
		this.name = name;
		this.athor = athor;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getAthor() {
		return athor;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return name +"\t"+athor+"\t"+price;
	}
	
}


public class Demo4 {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		list.add(new Book("java �����ŵ�����","����",80.5));
		list.add(new Book("javascript �����ŵ���ͨ","����С",40.5));
		list.add(new Book("Oracle","��˹�����˹��",83.5));
		list.add(new Book("JSP","�������",70.5));
		list.add(new Book("LOL","¬��ү",15.5));
		System.out.println("����1");
		System.out.println(list.stream().filter(a->!a.getName().contains("java")).count());
	}
}





