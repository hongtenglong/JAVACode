package day07.homeWork;

public class ZuoYe3 {
	public static void main(String[] args) {
		Student ly = new Student();
		Student htl = new Student("htl",21);
	}
}

class Student {
	String no;
	String name;
	int age;

	public Student() {
		no = "0000";
		name = "A";
		age = 18;
	}

	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
}