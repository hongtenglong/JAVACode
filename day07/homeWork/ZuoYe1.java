package day07.homeWork;

public class ZuoYe1 {
	public static void main(String[] args) {
		Salary s = new Salary();
		System.out.println("清洁工：" + s.money(4000));
		System.out.println("程序员：" + s.money(4000, 3000));
		System.out.println("项目经理：" + s.money(4000, 3000, 10000));
	}
}

class Salary {
	public int money(int base) {
		return base;
	}

	public int money(int base, int jiangJin) {

		return base + jiangJin;
	}

	public int money(int base, int jiangJin, int fenHong) {
		return base + jiangJin + fenHong;
	}
}