package day08.caiquan;

public class Person {
	private String name;
	private int score = 0;
	private static Person p = new Person();
	private Person() {}
	public static Person getPerson() {
		return p;
	}
	
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public int getScore() {
		return score;
	}
	public Person setScore(int score) {
		this.score = score;
		return this;
	}
	
}
