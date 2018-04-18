package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**��ϰ���������ӿ�*/
class Book1{
	private String name;
	private double price;
	private String author;
	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book1(String name, double price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+price+","+author;
	}
	
}
public class TestPredicate {

	//����ͼ�����
	public int predicateCount(List<Book1> books , Predicate<Book1> p) {
		int count = 0;
		for(Book1 book:books) {
			if(p.test(book)) {
				count ++;
			}
		}
		return count;
	}
	//����ͼ����Ϣ
	public void predicateIBook(List<Book1> books,Predicate<Book1> p) {
		for(Book1 book:books) {
			if(p.test(book)) {
				System.out.println(book);
			}
		}
	}
	public static void main(String[] args) {
		List<Book1> books = new ArrayList<>();
		Book1 book1 = new Book1("java���˼��",88.8,"����");
		Book1 book2 = new Book1("java��̻���",33.3,"������");
		Book1 book3 = new Book1("���ݽṹ�����",22.2,"����");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		TestPredicate t = new TestPredicate();
		int count = t.predicateCount(books, t1 -> t1.getName().contains("java"));
		System.out.println(count+" ��");
		
		t.predicateIBook(books, t1 -> t1.getName().length() > 5);
		System.out.println("-----------------------------");
		t.predicateIBook(books, t1->t1.getPrice()>20 && t1.getAuthor().length() == 2);
		

	}

}
