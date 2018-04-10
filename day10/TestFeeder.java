package day10;
class Food{
	private String name;
	public Food(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class Bone extends Food{
	public Bone(String name) {
		super(name);
	}	
}
class Fish extends Food{
	public Fish(String name) {
		super(name);
	}	
}
class Animal{
	public void eat(Food food) {
		System.out.println("��"+food);
	}
}
class Dog2 extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("С����:"+food.getName());
	}
}
class Cat1 extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("Сè��:"+food.getName());
	}
}
class Feeder{
	public void feed(Food food,Animal animal) {
		System.out.println("����Աι����");
		animal.eat(food);
	}
}
public class TestFeeder {

	public static void main(String[] args) {
		Bone bone = new Bone("��ͷ");
		Fish fish = new Fish("��");
		Dog2 dog = new Dog2();
		Cat1 cat = new Cat1();
		Feeder guojing = new Feeder();
		guojing.feed(bone, dog);
		guojing.feed(fish, cat);
		

	}

}
