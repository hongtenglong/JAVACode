package day09.homeWork;

import java.util.Scanner;

class Pizza{
	private String name;
	private double price;
	private int size;
	
	public Pizza() {
		super();
	}
	public Pizza(String name, double prive, int size) {
		super();
		this.name = name;
		this.price = prive;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "我是 " + name + ", 价格：" + price + ", 大小：" + size + "寸";
	}
}
class HaiXianPizza extends Pizza{
	private int money = 10;
	public void setPrice(int size) {
		super.setName("海鲜披萨");
		super.setSize(size);
		super.setPrice(money * size);
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

class PeiGenPizza extends Pizza{
	private int money = 15;
	public void setPrice(int size) {
		super.setName("培根披萨");
		super.setSize(size);
		super.setPrice(money * size);
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}


public class ZuoYe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要定做的Pizza：（1. 海鲜     2.培根）");
		switch(sc.nextInt()){
		case 1:
			HaiXianPizza h = new HaiXianPizza();
			System.out.println("您要定做的海鲜披萨单价为"+h.getMoney()+"\n请输入需要定做的尺寸:");
			int size = sc.nextInt();
			h.setPrice(size);
			System.out.println(h);
			break;
		case 2:
			PeiGenPizza p = new PeiGenPizza();
			System.out.println("您要定做的培根披萨单价为"+p.getMoney()+"\n请输入需要定做的尺寸:");
			int size1 = sc.nextInt();
			p.setPrice(size1);
			System.out.println(p);
			break;
		}
	}
}
