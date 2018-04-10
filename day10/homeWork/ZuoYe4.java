package day10.homeWork;

import com.sun.xml.internal.ws.addressing.W3CAddressingConstants;

abstract class Animal1{
	private String name;
	private String color;
	private boolean type;
	public abstract void eat();
	public abstract void shout();
	
	public Animal1(String name, String color, boolean type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
}
interface Swim{
	void swim();
}

class Rabbit extends Animal1{
	
	public Rabbit(String name, String color, boolean type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("兔子是"+(isType()?"哺乳类":"非哺乳类")+"爱吃胡萝卜");
	}
	@Override
	public void shout() {
		System.out.println("那只"+getColor()+"的，名叫"+getName()+"的兔子正在叽叽的叫");
		
	}
	
}
class Frog extends Animal1 implements Swim{
	
	public Frog(String name, String color, boolean type) {
		super(name, color, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("青蛙是"+(isType()?"哺乳类":"非哺乳类")+"爱吃虫子");
	}
	@Override
	public void shout() {
		System.out.println("那只"+getColor()+"的，名叫"+getName()+"的兔子正在叽叽的叫");
		
	}
	@Override
	public void swim() {
		System.out.println("虽然不是鱼，但青蛙也是泳坛泳坛高手");
		
	}
	
}
public class ZuoYe4 {
	public static void main(String[] args) {
		Rabbit r = new Rabbit("小红", "白色", true);
		Frog f = new Frog("小跳蛙","原谅色",false);
		r.eat();
		r.shout();
		f.eat();
		f.shout();
		f.swim();
	}
	
}
