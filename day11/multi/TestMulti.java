package day11.multi;

//在类中有共性的内容，可以来继续向上抽取(父类)
//共性内容有不同的体现形式,无法清晰描述,设置为抽象
abstract class Animal{
	String name;
	abstract void eat();
	
}


class Pig extends Animal{
	
	String name="小猪佩奇";
	@Override
	void eat() {
		System.out.println("吃猪食");
	}
	
}

class Dog extends Animal{
	String name = "旺财";
	@Override
	void eat() {
		System.out.println("吃狗粮");
	}
	
	public void door(){
		System.out.println("看门");
	}
	
}

//主人
class Master{
	String name = "atm";
	
	//买宠物(根据传入字符串购买不同宠物)
	public Animal buy(String str){
		if("dog".equalsIgnoreCase(str)){
			return new Dog();
		}else{
			return new Pig();
		}
	}
	
	//玩耍
	/*public void play(Pig pig){
		System.out.println(name+"正在和"+pig.name+"玩耍");
	}
	public void play(Dog dog){
		System.out.println(name+"正在和"+dog.name+"玩耍");
	}*/
	public void play(Animal anim){
		System.out.println(name+"正在和"+anim.name+"玩耍");
	}
	
}


public class TestMulti {

	public static void main(String[] args) {
		Master master = new Master();
		System.out.println(master.buy("dog") instanceof Dog);
		/*Master master = new Master();
		Animal anim = new Dog();
		anim.name = "旺财";
		master.play(anim);*/
		
		
		/*Dog dog = new Dog();
		master.play(dog);*/
		//多态(调用的真正对象的方法)
		//Animal anim = new Dog();
		//anim.eat();
		//无法调用子类独有方法
		//anim.door();
		//强制类型转换(如果为转换为真实类型)
		/*if(anim instanceof Dog){
			
		}else if(anim instanceof Pig){
			
		}*/
	}
	
	//父类作为参数类型
	
	//父类类型作为返回值类型
	
	
}
