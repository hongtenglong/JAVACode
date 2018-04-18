package day16;

import java.util.ArrayList;
import java.util.List;
class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name+","+age;
	}
	
	
}
public class Demo3 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("zhang3",20));
		list.add(new Student("li4",30));
		list.add(new Student("wang5",40));
		list.add(new Student("zhou6",50));
		
		list.forEach(System.out::println);
		System.out.println("---------------------");
		System.out.println(list.stream().filter(s->{return s.getAge()>30;}));//.forEach(System.out::println);;
		//list.remove(list.stream().filter(s->{return s.getAge()>30;}));
		System.out.println("---------------------");
		list.forEach(System.out::println);
	}
}
