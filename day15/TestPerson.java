package day15;

import java.util.HashSet;
import java.util.Set;

class Person{
	private int no;
	private String name;
	public Person() {
	}
	public Person(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return no+","+name;
	}
	@Override
	public int hashCode() {
		return no+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		//this,obj
		Person per = (Person)obj;
		
		return this.no == per.no && this.name.equals(per.name);
	}
}
public class TestPerson {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		Person zhangsan = new Person(1,"zhangsan");
		Person lisi = new Person(3,"lisi");
		Person wangwu = new Person(1,"zhangsan");
		set.add(zhangsan);
		set.add(lisi);
		set.add(wangwu);
		
		set.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}

}
