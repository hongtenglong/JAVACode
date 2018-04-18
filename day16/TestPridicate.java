package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Student1{
	private String name;
	private int age;
	public Student1() {
		super();
	}
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
public class TestPridicate {
	public void check(List<Student1> list,Predicate<Student1> p) {
		for(Student1 stu:list) {
			if(p.test(stu)) {
				System.out.println(stu);
			}
		}
	}

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		Student1 stu1 = new Student1("zhangsan",36);
		Student1 stu2 = new Student1("lisi",20);
		Student1 stu3 = new Student1("wangwu",22);
		Collections.addAll(list, stu1,stu2,stu3);
		
		new TestPridicate().check(list, t -> t.getAge()>30 && t.getName().contains("g"));

	}

}
