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
		System.out.println("吃"+food);
	}
}
class Dog2 extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("小狗吃:"+food.getName());
	}
}
class Cat1 extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("小猫吃:"+food.getName());
	}
}
class Feeder{
	public void feed(Food food,Animal animal) {
		System.out.println("饲养员喂养；");
		animal.eat(food);
	}
}
public class TestFeeder {

	public static void main(String[] args) {
		Bone bone = new Bone("骨头");
		Fish fish = new Fish("鱼");
		Dog2 dog = new Dog2();
		Cat1 cat = new Cat1();
		Feeder guojing = new Feeder();
		guojing.feed(bone, dog);
		guojing.feed(fish, cat);
		

	}

}
