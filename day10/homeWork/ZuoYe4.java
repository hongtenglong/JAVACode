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
		System.out.println("������"+(isType()?"������":"�ǲ�����")+"���Ժ��ܲ�");
	}
	@Override
	public void shout() {
		System.out.println("��ֻ"+getColor()+"�ģ�����"+getName()+"����������ߴߴ�Ľ�");
		
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
		System.out.println("������"+(isType()?"������":"�ǲ�����")+"���Գ���");
	}
	@Override
	public void shout() {
		System.out.println("��ֻ"+getColor()+"�ģ�����"+getName()+"����������ߴߴ�Ľ�");
		
	}
	@Override
	public void swim() {
		System.out.println("��Ȼ�����㣬������Ҳ��Ӿ̳Ӿ̳����");
		
	}
	
}
public class ZuoYe4 {
	public static void main(String[] args) {
		Rabbit r = new Rabbit("С��", "��ɫ", true);
		Frog f = new Frog("С����","ԭ��ɫ",false);
		r.eat();
		r.shout();
		f.eat();
		f.shout();
		f.swim();
	}
	
}
