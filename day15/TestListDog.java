package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**��ϰ��List�洢*/
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
		Dog meimei = new Dog("����","������",2);
		Dog wangwang = new Dog("����","��ʨ",1);
		Dog huanhuan = new Dog("����","��ë",3);
		dogs.add(meimei);
		dogs.add(wangwang);
		dogs.add(huanhuan);
//		������ӡ������������Ϣ ��
		dogs.forEach(System.out::println);
//		��Comparableʵ��������Ȼ��������
		dogs.sort(null);
		System.out.println("�������������");
		dogs.forEach(System.out::println);
//		��Comparatorʵ���ⲿ�Ƚ������併������
/*		dogs.sort(new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				
				return o2.getAge() - o1.getAge();
			}
		});*/
		dogs.sort((o1,o2)->o2.getAge() - o1.getAge());
		System.out.println("���併�������");
		dogs.forEach(System.out::println);
//		ɾ����������Ϣ
		dogs.remove(meimei);
		System.out.println(dogs.contains(meimei));
//		��������л�ʣ�¼�ֻ����
		System.out.println("ɾ����");
		dogs.forEach(System.out::println);
		System.out.println(dogs.size()+"ֻ");

	}

}
