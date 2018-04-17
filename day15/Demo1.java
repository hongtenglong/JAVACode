package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

class Dog1 implements Comparable<Dog1>{
	private String name;
	private String type;
	private int age;

	public Dog1(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + type + "\t" + age;
	}

	@Override
	public int compareTo(Dog1 o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}

public class Demo1 {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("亮亮", "金毛", 2));
		dogs.add(new Dog("欢欢", "松狮", 3));
		dogs.add(new Dog("美美", "拉布拉多", 1));
		dogs.forEach(System.out::println);
		
		System.out.println("年龄升序排序后：");
		dogs.sort(null);
		dogs.forEach(System.out::println);
		
		System.out.println("年龄降序排序后：");
		/*dogs.sort(new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
		});*/
		dogs.sort((o1,o2)->o2.getAge()-o1.getAge());
		dogs.forEach(System.out::println);
		
		dogs.remove(2);
		dogs.forEach(System.out::println);
	}
	
}
