package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**练习：List存储*/
class Dog implements Comparable<Dog>{
	private String name;
	private String type;
	private int age;
	public Dog() {
	}
	public Dog(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return name+"\t"+type+"\t"+age;
	}
	@Override
	public int compareTo(Dog o) {
		return this.age - o.age;
	}
	
	
}
public class TestListDog {

	public static void main(String[] args) {
		// 
		List<Dog> dogs = new ArrayList<>();
		Dog meimei = new Dog("美美","吉娃娃",2);
		Dog wangwang = new Dog("旺旺","松狮",1);
		Dog huanhuan = new Dog("欢欢","金毛",3);
		dogs.add(meimei);
		dogs.add(wangwang);
		dogs.add(huanhuan);
//		逐条打印出各条狗狗信息 。
		dogs.forEach(System.out::println);
//		用Comparable实现年龄自然升序排序
		dogs.sort(null);
		System.out.println("年龄升序排序后：");
		dogs.forEach(System.out::println);
//		用Comparator实现外部比较器年龄降序排序
/*		dogs.sort(new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				
				return o2.getAge() - o1.getAge();
			}
		});*/
		dogs.sort((o1,o2)->o2.getAge() - o1.getAge());
		System.out.println("年龄降序排序后：");
		dogs.forEach(System.out::println);
//		删除美美的信息
		dogs.remove(meimei);
		System.out.println(dogs.contains(meimei));
//		输出集合中还剩下几只狗狗
		System.out.println("删除后：");
		dogs.forEach(System.out::println);
		System.out.println(dogs.size()+"只");

	}

}
