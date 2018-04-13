package day13.stage2;
abstract class Food{
	private String foodName;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Food(String foodName) {
		this.foodName = foodName;
	}
	
}
class Bone extends Food{

	public Bone(String foodName) {
		super(foodName);
	}
	
}
class Fish extends Food{
	public Fish(String foodName) {
		super(foodName);
	}
	
}
abstract class Animal{
	public abstract void eat(Food food);
}
class Dog extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("小狗吃："+food.getFoodName());
	}
	
}
class Cat extends Animal{
	@Override
	public void eat(Food food) {
		System.out.println("小猫吃："+food.getFoodName());
	}
	
}
class Feedter{
	public void feed(Food food,Animal animal){
		System.out.println("管理员喂养：");
		animal.eat(food);
	}
}
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bone bone = new Bone("骨头");
		Fish fish = new Fish("鱼");
		Feedter guojing = new Feedter();
		guojing.feed(bone, dog);
		guojing.feed(fish, cat);
	}

}
