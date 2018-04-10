package day10.homeWork;
class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void shout() {
		System.out.println("叫！");
	}
}
interface Terrestrial{
	public abstract int getLegNum();
}
class Cat extends Animal implements Terrestrial {
	private int legNum;
	public Cat(String name,int legNum) {
		super(name);
		this.legNum = legNum;
	}
	public void shout() {
		System.out.println(name+"\t"+legNum+"\t旺旺旺");
	}
	@Override
	public int getLegNum() {
		return legNum;
	}
}

class Duck extends Animal implements Terrestrial {
	private int legNum;
	public Duck(String name,int legNum) {
		super(name);
		this.legNum = legNum;
	}
	public void shout() {
		System.out.println(name+"\t"+legNum+"\t嘎嘎嘎");
	}
	@Override
	public int getLegNum() {
		return legNum;
	}
}

class Dolphin extends Animal{
	public Dolphin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shout() {
		System.out.println(name+"\t0\t海疼音");
	}
	
}

public class Disney {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		Animal cat = new Cat("汤姆猫",4);
		Animal duck = new Duck("唐老鸭",2);
		Animal dolphin = new Dolphin("海豚奇奇");
		animals[0] = cat;
		animals[1] = duck;
		animals[2] = dolphin;
		System.out.println("动物名字\t腿的条数\t动物叫");
		for (Animal animal : animals) {
			animal.shout();
		}
	}
}
