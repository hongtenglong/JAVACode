package day16.homeWork;

import java.util.Deque;
import java.util.LinkedList;

class Book{
	private int no;
	private String name;
	private double price;
	public Book(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price ;
	}
}
public class ZuoYe1 {
	public static void main(String[] args) {
		Deque<Book> d = new LinkedList<>();
		//»Î’ª
		d.push(new Book(1,"java",86.5));
		d.push(new Book(3,"jsp",82.5));
		d.push(new Book(4,"php",36.5));
		d.push(new Book(2,"c++",53.5));
		//≥ˆ’ª
		System.out.println(d.poll());
		System.out.println(d.poll());
		System.out.println(d.poll());
		
	}
}
