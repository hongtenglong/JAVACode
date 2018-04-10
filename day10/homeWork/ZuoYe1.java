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
		System.out.println("踢足球");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(no + "," + name + ",工资" + salary + ",奖金" + JiangJin + "做管理工作");
	}
}

class ChengXuYuan extends Employee{
	public ChengXuYuan(int no, String name, double salary) {
		super(no, name, salary);
	}

	@Override
	public void show() {
		System.out.println(no + "," + name + ",工资" + salary + ",做开发编码工作");
	}
	public void KanShu() {
		System.out.println("看书");
	}
}
public class ZuoYe1 {
	public static void main(String[] args) {
		JingLi j = new JingLi(1, "张五", 4000, 10000);
		ChengXuYuan c = new ChengXuYuan(2, "张三", 4500);
		j.show();
		j.TiQiu();
		c.show();
		c.KanShu();
	}
}
