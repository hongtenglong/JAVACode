package day10.homeWork;
class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public void shout() {
		System.out.println("�У�");
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
		System.out.println(name+"\t"+legNum+"\t������");
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
		System.out.println(name+"\t"+legNum+"\t�¸¸�");
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
		System.out.println(name+"\t0\t������");
	}
	
}

public class Disney {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		Animal cat = new Cat("��ķè",4);
		Animal duck = new Duck("����Ѽ",2);
		Animal dolphin = new Dolphin("��������");
		animals[0] = cat;
		animals[1] = duck;
		animals[2] = dolphin;
		System.out.println("��������\t�ȵ�����\t�����");
		for (Animal animal : animals) {
			animal.shout();
		}
	}
}
