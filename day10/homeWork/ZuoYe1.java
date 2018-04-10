package day10.homeWork;

abstract class Employee {
	int no;
	String name;
	double salary;

	public Employee(int no, String name, double salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}

	public abstract void show();
}

class JingLi extends Employee {
	double JiangJin;
	public JingLi(int no, String name, double salary, double JiangJin) {
		super(no, name, salary);
		this.JiangJin = JiangJin;
		// TODO Auto-generated constructor stub
	}
	public void TiQiu() {
		System.out.println("������");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(no + "," + name + ",����" + salary + ",����" + JiangJin + "��������");
	}
}

class ChengXuYuan extends Employee{
	public ChengXuYuan(int no, String name, double salary) {
		super(no, name, salary);
	}

	@Override
	public void show() {
		System.out.println(no + "," + name + ",����" + salary + ",���������빤��");
	}
	public void KanShu() {
		System.out.println("����");
	}
}
public class ZuoYe1 {
	public static void main(String[] args) {
		JingLi j = new JingLi(1, "����", 4000, 10000);
		ChengXuYuan c = new ChengXuYuan(2, "����", 4500);
		j.show();
		j.TiQiu();
		c.show();
		c.KanShu();
	}
}
