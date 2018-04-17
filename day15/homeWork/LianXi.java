package day15.homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * ���ﳵϵͳ
 * 
 * */
class Goods implements Comparable<Goods> {
	private int no;
	private String name;
	private double price;
	private int num;
	public Goods(int no) {
		this.no = no;
	}
	public Goods(int no, String name, double price, int num) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(Goods o) {
		// TODO Auto-generated method stub
		return this.no - o.no;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Goods o = (Goods) obj;
		return this.no == o.no;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price + "\t" + num;
	}

}

class Cart {
	List<Goods> car = new ArrayList<Goods>();
	Scanner sc = new Scanner(System.in);
	
	
	
	public boolean isExit(int no) {
		Goods g = new Goods(no);
		return car.contains(g);
	}
	public void addGoods() {
		System.out.print("�������ţ�");
		int no = sc.nextInt();
		if (isExit(no)) {
			System.out.println("�Ѵ��������Ʒ");
			return;
		}
		System.out.print("���������ƣ�");
		String name = sc.next();
		System.out.print("������۸�");
		double price = sc.nextDouble();
		System.out.print("������������");
		int num = sc.nextInt();
		Goods g = new Goods(no,name,price,num);
		
		car.add(g);
		System.out.println("��ӳɹ�");
	}

	public void updateGoods() {
		System.out.print("����Ҫ�޸ĵı�ţ�");
		int no1 = sc.nextInt();
		if (!isExit(no1)) {
			System.out.println("�����������Ʒ");
			return;
		}
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getNo() == no1) {
				System.out.print("�������µ�������");
				int num = sc.nextInt();
				car.get(i).setNum(num);
				break;
			}
		}
	}
	public void deleteGoods() {
		System.out.print("����Ҫɾ���ı�ţ�");
		int no1 = sc.nextInt();
		if (!isExit(no1)) {
			System.out.println("�����������Ʒ");
			return;
		}
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getNo() == no1) {
				car.remove(i);
				System.out.print("ɾ���ɹ���");
				break;
			}
		}
	}
	
	public void showAllGoods() {
		if(car.size()==0) {
			System.out.println("û����Ʒ");
			return;
		}
		System.out.println("���\t����\t�۸�\t����");
		car.forEach(System.out::println);
	}
}

class Meun {
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("************************�˵�************************");
		System.out.println("1.���;  2.�޸�����;  3.ɾ����Ʒ;  4.��ѯȫ��;  5.�˳�");
		System.out.println("****************************************************");
		System.out.print("--������ѡ��");
		int select = sc.nextInt();
		Cart c = new Cart();
		while (select != 5) {
			switch (select) {
			case 1:
				c.addGoods();
				break;
			case 2:
				c.updateGoods();
				break;
			case 3:
				c.deleteGoods();
				break;
			case 4:
				c.showAllGoods();
				break;
			case 5:
				select = 5;
				System.out.println("�ɹ��˳�ϵͳ");
				continue;
			}
			System.out.println("\n");
			System.out.println("************************�˵�************************");
			System.out.println("1.���;  2.�޸�����;  3.ɾ����Ʒ;  4.��ѯȫ��;  5.�˳�");
			System.out.println("****************************************************");
			System.out.print("--������ѡ��");
			select = sc.nextInt();
		}
	}
}

public class LianXi {
	public static void main(String[] args) {
		Meun m = new Meun();
		m.go();
		
	}
}
