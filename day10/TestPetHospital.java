package day10;
/**示例：参数多态*/
class Pet{
	private String name;
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println("吃");
	}	
}
class Dog extends Pet{
	public Dog(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("小狗吃骨头");
	}
	public void run() {
		System.out.println("小狗跑了");
	}
}
class Cat extends Pet{
	public Cat(String name) {
		super(name);
	}
	public void eat() {
		System.out.println("小猫吃鱼");
	}
	public void play() {
		System.out.println("小猫去玩儿了");
	}
}
class PetHospital{
	// Dog -> Pet  向上类型转换
	public void treatment(Pet pet) {// Pet pet = wangwang; ->Pet pet = new Dog();
		System.out.println("给："+pet.getName()+"看病");
		pet.eat();
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;// 父类 -》子类
			dog.run();
		}else if(pet instanceof Cat) {
			Cat cat = (Cat)pet;
			cat.play();
		}
	}
}
public class TestPetHospital {
	public static void main(String[] args) {
		Dog wangwang = new Dog("旺旺");
		Cat xiaohua = new Cat("小花");
		PetHospital hos = new PetHospital();
		hos.treatment(wangwang);
		hos.treatment(xiaohua);

	}

}
