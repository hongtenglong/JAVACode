package day06.homeWork;

public class ZuoYe03 {
	public static void main(String[] args){
		Person person1 = new Person();
		person1.name = "Tom";
		person1.age = 22;
		person1.sex = 0;
		person1.addAge(2);
		person1.study();
		person1.showAge();
		Person person2 = new Person();
		person2.name = "Cat";
		person2.age = 21;
		person2.sex = 1;
		person2.addAge(5);
		person2.study();
		person2.showAge();
		
	}
}

class Person{
	String name;
	int age;
	int sex;
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("ÄêÁäÎª:"+age);
	}
	public int addAge(int i ) {
		return age+=i;
	}
}