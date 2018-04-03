package day06.homeWork;

public class ZuoYe02 {
	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		visitor.name = "htl";
		visitor.age = 21;
		System.out.println(visitor.show());
	}
}

class Visitor {
	String name;
	int age;

	public String show() {
		return "ĞÕÃû£º" + name + " ÄêÁä£º" + age;
	}
}