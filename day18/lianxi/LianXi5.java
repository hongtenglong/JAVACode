package day18.lianxi;

import java.util.ArrayList;
import java.util.List;

class Worker{
	private String name;
	private int age;
	private int salary;
	
	public Worker(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class LianXi5 {
	public static void main(String[] args) {
		List<Worker> list = new ArrayList<>();
		list.add(new Worker("zhang3", 18, 3000));
		list.add(new Worker("li4", 25, 3500));
		list.add(new Worker("wang5", 22, 3200));
		list.add(1, new Worker("zhao6", 24, 3300));
		list.remove(3);
		for (Worker worker : list) {
			System.out.println(worker);
		}
		System.out.println("------------------------");
		list.forEach(System.out::println);
	}

}







